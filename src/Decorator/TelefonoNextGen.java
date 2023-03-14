package Decorator;

public class TelefonoNextGen extends TelefonoDecorator{
    public TelefonoNextGen(Telefono telefono){
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println("Tengo tambien 5G");
        System.out.println("Tengo tambien VoLTE");
    }
}
