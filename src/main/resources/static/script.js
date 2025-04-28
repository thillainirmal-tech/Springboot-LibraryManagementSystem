// Get the form and elements
const addBookForm = document.getElementById('add-book-form');
const bookList = document.getElementById('book-list');

// API URLs
const apiUrl = 'http://localhost:8080/api/books';

// Function to fetch books from the API
async function getBooks() {
    try {
        const response = await fetch(apiUrl);
        const books = await response.json();
        displayBooks(books);
    } catch (error) {
        console.error('Error fetching books:', error);
    }
}

// Function to display books in the list
function displayBooks(books) {
    bookList.innerHTML = '';
    books.forEach(book => {
        const li = document.createElement('li');
        li.textContent = `${book.title} by ${book.author}`;
        bookList.appendChild(li);
    });
}

// Function to handle form submission (Add Book)
addBookForm.addEventListener('submit', async (event) => {
    event.preventDefault();

    const title = document.getElementById('title').value;
    const author = document.getElementById('author').value;

    try {
        const response = await fetch(apiUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ title, author })
        });

        if (response.ok) {
            getBooks(); // Refresh the list after adding
            addBookForm.reset();
        } else {
            alert('Failed to add the book');
        }
    } catch (error) {
        console.error('Error adding book:', error);
    }
});

// Initial fetch of books
getBooks();
