package Builder;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new CocheBuilder("Filostros")
                .setPuertas(5)
                .setMotor("Electrico")
                .build();

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Puertas: " + coche.getPuertas());
        System.out.println("Motor: " + coche.getMotor());
    }
}
