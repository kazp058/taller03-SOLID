/*public class LogIn {
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Logic
    }
    public void insertUserInDatabase(User user){
        // Insert user in database
    }
}
*/

/* Las clases LogIn y LogInAdmin no cumplen con el principio de Sustitucoin de Liskov ya que la segunda extiende de la primera 
y sobreescribe el metodo LogIn. Al sobreescribir este metodo, le agrega una nueva funcionalidad que puede generar problemas si 
intento sustituir la clase hija por la padre.*/

//************SOLUCION************

import interfaces.IPersistence;

public class LogIn {
	
    public void log(User user) {
    	if (RoleVerifier.checkHasPermissions(user)) {
    		System.out.println("Has access to admin Website.");
        } else {
        	System.out.println("Has access to the website");
            
        	IPersistence mydb = new MySQL();
            mydb.insert(user);
        }
        // Logic
    }

    /* 
    No cumple el single responsability, ya que en la clase con la responsabilidad de hacer el login
    esta haciendo inserciones en la base de datos.

    Solucion: usar la clase base de datos, abstraida a recibir objectos.


    public void insertUserInDatabase(User user) {
        // Insert user in database
    }
    */
}