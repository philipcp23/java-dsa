public class Office {
   private String name;
   private Pictures pictures;
   private Books books;
   private Furniture furniture;

    public Office(String name, Pictures pictures, Books books, Furniture furniture) {
        this.name = name;
        this.pictures = pictures;
        this.books = books;
        this.furniture = furniture;
    }

    public Books getBooks() {
        return this.books;
    }

    public void getFurnitureName() {
        System.out.println("Furniture name = " + furniture.getName());
    }

    public void readBook() {
        System.out.println("Office -> Start working");
        books.read();
    }

    public void getOfficeName() {
        System.out.println("Name of Office = " + this.name);
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
