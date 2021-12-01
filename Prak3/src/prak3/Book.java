package prak3;

public class Book {
    private int num_pages;
    private int year;
    private String author;
    public String name;

    public Book(int num_pages, int year, String author, String name)
    {
        this.num_pages = num_pages;
        this.year = year;
        this.author = author;
        this.name = name;
    }

    public void setNum_pages(int num_pages)
    {
        this.num_pages = num_pages;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNum_pages()
    {
        return num_pages;
    }

    public int getYear()
    {
        return year;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Book{Number of pages is "+ num_pages + ", year of publishing is " + year + ", author is " + author + ", the name is " + name + "}.";
    }
}
