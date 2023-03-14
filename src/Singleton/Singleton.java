package Singleton;

public class Singleton {
    //Declaracion de la nueva instancia
    private static Singleton singleton;
    int contador;
    //Evita la construccion de nuevas instancias
    private Singleton(){}
    //Funcion de la instancion en el patron Singleton
    public static Singleton getInstance(){
        //Solo dentro de esta funcion existe la palabra new
        if(singleton == null){
            singleton = new Singleton();
        }
       return singleton;
    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }



}
