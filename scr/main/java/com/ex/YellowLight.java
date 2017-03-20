package trafficlight;


public class YellowLight {
    String name;

    public YellowLight(String name) {
        this.name = name;
    }

    public void burn() {
        System.out.println("Горит " + name + " свет");
    }
}
