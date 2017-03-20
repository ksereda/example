package trafficlight;


public class Game {
    TrafficLight trafficLight;
    static Game instance;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void init() {
        trafficLight = new TrafficLight("Светофор");
        Colour colour = new Colour();
        trafficLight.colour = colour;

        GreenLight greenLight = new GreenLight(" ЗЕЛЁНЫЙ ");
        YellowLight yellowLight = new YellowLight(" ЖЁЛТЫЙ ");
        RedLight redLight = new RedLight(" КРАСНЫЙ ");

        trafficLight.initWithGreen(greenLight);
        trafficLight.initWithYellow(yellowLight);
        trafficLight.initWithRed(redLight);

        colour.getShootGreen();
        colour.getShootYellow();
        colour.getShootRed();
    }

    public void start() {
        trafficLight.colour.blinkGreen();
        trafficLight.colour.blinkYellow();
        trafficLight.colour.blinkRed();
    }
}

