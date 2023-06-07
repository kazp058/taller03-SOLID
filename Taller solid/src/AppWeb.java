import interfaces.IPersistence;

public class AppWeb {
    LogIn logIn;
    LogInAdmin logInAdmin;

    /*
    Principio de inversion de dependencia, ya que la connecion a la base de datos no deberia depender de su implementacion
    directa sino de su abstraccion.
    MySQL mySQL;
    */

    /*
    * SOLUCION: IMPLEMENTACION DE UNA INTERFAZ IPERSISTENCE PARA ABSTRAER LA CONEXION.
    * */
    IPersistence mydb;

    public AppWeb (LogIn logIn, IPersistence mydb) {
        // Logic
    }
    public AppWeb (LogInAdmin logInAdmin, IPersistence mydb) {
        // Logic
    }
    public void connectToDatabase (IPersistence mydb) {
        // Logic
    }
}

