package Adapter;

public class Horno implements Enchufable{
    boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
        System.out.println("Horno Encendido");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Horno Apagado");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
