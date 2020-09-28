public class Books {
    private boolean fiction;
    private String name;

    public Books(boolean fiction, String name) {
        this.fiction = fiction;
        this.name = name;
    }

    public void getTypeOfBook() {
        if (fiction) {
            System.out.println("This is a fiction book");
        } else
            System.out.println("This is a non fiction book");
    }

    public void read() {
        if(!fiction)
            System.out.println("I am reading Mamba Mentality");
    }

    public boolean isFiction() {
        return fiction;
    }

    public String getName() {
        return name;
    }
}
