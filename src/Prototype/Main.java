package Prototype;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.puertas = 5;
        vehiculo.marca = "Filostros";
        vehiculo.modelo = "Coupe";

        System.out.println(vehiculo.puertas + " " + vehiculo.marca + " " + vehiculo.modelo);


        try{
            Vehiculo clonado = vehiculo.clonar();
            clonado.puertas = 3;
            System.out.println(clonado.puertas + " " + clonado.marca + " " + clonado.modelo);
        }catch(CloneNotSupportedException e){
            System.out.println("no se puede clona: " + e.getMessage());
        }

    }
}
