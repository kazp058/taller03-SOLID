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

public class LogIn {
	
    public void log(User user) {
    	if (RoleVerifier.checkHasPermissions(user)) {
    		System.out.println("Has access to admin Website.");
        } else {
        	System.out.println("Has access to the website");
        	insertUserInDatabase(user);
        }
        // Logic
    }

    public void insertUserInDatabase(User user) {
        // Insert user in database
    }
}