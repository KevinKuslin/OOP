package DependencyInj; 

public class Switch{
    private IElectronic ielectronic;

    public Switch(IElectronic ielectronic) {
        this.ielectronic = ielectronic; 
    }

    @Override 
    public void operate(String command) {
        if (command.equals("ON")) {
            ielectronic.turnOn();
        } else {
            ielectronic.turnOff();
        }
    }

    public static void main(String[] args) {
        
    }
}
