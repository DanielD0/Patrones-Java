package Prototype;

public class Vehiculo implements Cloneable{
    public String marca;
    public String modelo;
    int puertas;

    public Vehiculo(){}

    public Vehiculo clonar() throws CloneNotSupportedException{
        return (Vehiculo)this.clone();
    }

}
