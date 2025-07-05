class Book {
    private String title;
    private int yearOfPublishing;
    private String[] authors;

    // Default constructor (no arguments)
    public Book() {
        this.title = "";
        this.yearOfPublishing = 0;
        this.authors = new String[0];
    }

    // Parameterized constructor
    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getYearOfPublishing() { return yearOfPublishing; }
    public void setYearOfPublishing(int yearOfPublishing) { this.yearOfPublishing = yearOfPublishing; }

    public String[] getAuthors() { return authors; }
    public void setAuthors(String[] authors) { this.authors = authors; }
}
