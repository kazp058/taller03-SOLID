import interfaces.IConnector;

public class CloudServicePlatform {
    private IConnector cloudServicePlatform;
    public void hostingTo (AppWeb app) {
    /*  No cumple con Open/Close porque si se desea agregar una
        nueva plataforma tengo que editar el codigo y no es extensible
        if (cloudServicePlatform==1) {
            System.out.println("Connect to AWS");
            // Logic
        }if (cloudServicePlatform==2) {
            System.out.println("Connect to Microsoft Azure");
            // Logic
        }else{
            System.out.println("Connect to Google Cloud");
            // Logic
        }
        */

        //SOLUCION:
        cloudServicePlatform.connect();
    }
    // More Methods
}

