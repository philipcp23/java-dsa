public class Hamburger {
    private String name;
    private String meat;
    private String bread;
    
    private double lettuce = .50;
    private double tomato = .50;
    private double pickle = .50;
    private double onion = .50;

    private double price = 6.00;

    public Hamburger(String name, String meat, String bread) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }
    
    public void additions(String additions) {
        String add = additions.toLowerCase();
        if (add.equals("tomato")) {
            price += this.tomato;
            System.out.println(tomato + " for tomato");
        }
        if (add.equals("lettuce")) {
            price += this.lettuce;
            System.out.println(lettuce + " for lettuce");
        }
        if (add.equals("pickle")) {
            price += this.pickle;
            System.out.println(pickle + " for pickle");
        }
        if (add.equals("onion")) {
            price += this.onion;
            System.out.println(onion + " for onion");
        }
    }

    public double getPrice() {
        return price;
    }

    public double addTax(double price) {
        double tax = price * 0.07;
        return tax + price;
    }
}
