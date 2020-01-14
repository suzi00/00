public class BookClass {
    private int YearOfPublishing;
    private int ISBN;
    private String Title;
    private String Author;
    private String Publisher;

    public BookClass(String title, String author, String publisher, int yearOfPublishing,  int ISBN){
        this.YearOfPublishing = yearOfPublishing;
        this.ISBN = ISBN;
        this.Title = title;
        this.Author = author;
        this.Publisher = publisher;
    }

    public int getYearOfPublishing() {
        return YearOfPublishing;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }


}
