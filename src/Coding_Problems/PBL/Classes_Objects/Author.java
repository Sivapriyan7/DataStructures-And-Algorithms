package Coding_Problems.PBL.Classes_Objects;
class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized constructor to initialize the variables
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters for all member variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Method to return author details as a string
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized constructor to initialize the variables
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters for all member variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // Method to return book details as a string
    public String toString() {
        return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Create an author object
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

        // Create a book object
        Book book = new Book("Harry Potter", author, 39.99, 100);

        // Print all details of the book
        System.out.println(book.toString());
    }
}
