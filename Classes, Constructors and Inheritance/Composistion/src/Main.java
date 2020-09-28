public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();



        Furniture furniture = new Furniture("Desk Chair");
        System.out.println("Name of chair is = " + furniture.getName());
        Books kobe = new Books(false, "The Mamba Mentality");
        Pictures golf = new Pictures(true, "2016 US Open at Oakmont", true, 1);
        if (golf.getHanging()) {
            System.out.println("Picture description = " + golf.getDescription());
        }

        Office office = new Office("Phil's Office", golf, kobe, furniture);
        office.getFurnitureName();
        office.getOfficeName();
        office.readBook();

        Lamp lamp = new Lamp("Desk lamp", true, 5);

        if (lamp.isBattery()) {
            System.out.println("Lamp is battery powered.");
        } else {
            System.out.println("Not battery powered");
        }



























    }
}
