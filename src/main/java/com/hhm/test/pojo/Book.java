package com.hhm.test.pojo;

/**
 * @author hhmstart
 * @create 2022-09-13 9:10
 */
public class Book {

    private Integer bookId;

    private BookType bookTypeId;

    private String bookName;

    private String isbn;

    private String author;

    private String press;

    private Double price;

    private Integer volume;

    private String coverImage;

    private Integer allowVolume;

    private Integer effective;

    public Book() {
    }

    public Book(Integer bookId, BookType bookTypeId, String bookName, String isbn, String author, String press, Double price, Integer volume, String coverImage, Integer allowVolume, Integer effective) {
        this.bookId = bookId;
        this.bookTypeId = bookTypeId;
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.press = press;
        this.price = price;
        this.volume = volume;
        this.coverImage = coverImage;
        this.allowVolume = allowVolume;
        this.effective = effective;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTypeId=" + bookTypeId +
                ", bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", coverImage='" + coverImage + '\'' +
                ", allowVolume=" + allowVolume +
                ", effective=" + effective +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public BookType getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(BookType bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Integer getAllowVolume() {
        return allowVolume;
    }

    public void setAllowVolume(Integer allowVolume) {
        this.allowVolume = allowVolume;
    }

    public Integer getEffective() {
        return effective;
    }

    public void setEffective(Integer effective) {
        this.effective = effective;
    }
}
