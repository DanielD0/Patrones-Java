package Singleton;

public class Main {
    public static void main(String[] args) {
        //Cuando se utiliza el patron singleton no se ocupa el new
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Valor: " + singleton.getContador() + " Espacio en memoria: " + singleton);
        System.out.println("Valor: " + singleton2.getContador() + " Espacio en memoria: " + singleton2);

        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();
        System.out.println(app + " " + app2);
        app.Run();
        app2.Run();
    }
}
