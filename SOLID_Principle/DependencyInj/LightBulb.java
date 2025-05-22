package DependencyInj; 

public class LightBulb implements IElectronic{
    public void turnOn() {
        System.out.println("Bulb on");
    }

    public void turnOff() {
        System.out.println("Bulb off");
    }
}
