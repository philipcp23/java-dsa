public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla(4, 330);
        tesla.steer(45);
        tesla.accelerate(50);
        tesla.accelerate(20);
        tesla.accelerate(-61);
    }
}
