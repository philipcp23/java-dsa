public class Pictures {
    private boolean framed;
    private String description;
    private boolean hanging;
    private int number;

    public Pictures(boolean framed, String description, boolean hanging, int number) {
        this.framed = framed;
        this.description = description;
        this.hanging = hanging;
        this.number = number;
    }

    public boolean getHanging() {
        return hanging;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
