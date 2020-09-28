public class Lamp {
    private String style;
    private boolean battery;
    private int globalRating;

    public Lamp(String style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public void turnOn() {
        System.out.println("Lamp is on");
    }

    public String getStyle() {
        return style;
    }

    public void isLampBattery() {
        System.out.println("Is the lamp battery powered = " + isBattery());
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
