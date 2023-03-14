package Adapter;

public class Lightbulb {

    boolean poweredOn = false;
    int voltage = 0;
    public void turnOn(int voltage){
        poweredOn = true;
        this.voltage = voltage;

        System.out.println("Lightbul powerOn with " + voltage + " of current");
    }
    public void turnOff(){
        poweredOn = false;
        voltage = 0;
        System.out.println("Lightbul poweredOff");
    }
    public boolean isPoweredOn(){
        return poweredOn;
    }
}
