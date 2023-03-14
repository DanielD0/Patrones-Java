package EjercicioSingleton;

public class Main {
    public static void main(String[] args){
        ConexionDB cdb = ConexionDB.getInstance();
        System.out.println(cdb);
        ConexionDB cdb2 = ConexionDB.getInstance();
        System.out.println(cdb2);
    }
}
