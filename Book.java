public class Book {
    private int id;
    private String title;
    private String author;
    private String publ_house;
    private int year;
    private int pages;
    private int price;
    private String binding_type;

    public Book(int id, String title, String author, String publ_house, int year, int pages, int price, String binding_type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publ_house = publ_house;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding_type = binding_type;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublHouse() {
        return publ_house;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }
    
    public String getBindingType() {
        return binding_type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublHouse(String publ_house) {
        this.publ_house = publ_house;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	public void setBindingType(String binding_type) {
        this.binding_type = binding_type;
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + year + ", " + publ_house;
    }
}

