package EjercicioSingleton;

public class ConexionDB {
    private static ConexionDB condb;
    private ConexionDB(){}

    public static ConexionDB getInstance() {
        if (condb == null) {
            condb = new ConexionDB();
            System.out.println("Se establecio la conexion con la Base de datos");
        } else {
            System.out.println("Ya tenias conexion con la base de datos");
        }

        return condb;
    }
}
