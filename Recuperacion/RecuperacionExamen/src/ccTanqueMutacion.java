import java.util.Random;
import java.util.Scanner;

public class ccTanqueMutacion {

    private String ccClave; 
    private final String CLAVE_CORRECTA = "321mutar";
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public ccTanqueMutacion() {
        this.ccClave = ""; 
    }

    public boolean ccSolicitarClave() { 
        System.out.print("Ingrese la clave: ");
        this.ccClave = scanner.nextLine();
        if (this.ccClave.equals(CLAVE_CORRECTA)) {
            System.out.println("Clave correcta. Iniciando proceso de mutacion");
            return true;
        } else {
            System.out.println("Clave incorrecta. Intente de nuevo.");
            return false;
        }
    }

    public void ccMutar(String nombre) {
        if (ccSolicitarClave()) { 
            int radiacion = random.nextInt(901) + 100;
            System.out.println(nombre + " es un hagfish/ HagfishCaicedo esta mutando:");
            System.out.println("Irradiando:");
            for (int i = 0; i <= 50; i++) {
                try {
                    Thread.sleep(100); // Espera para simular la animación
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                int progress = (int) ((i / 50.0) * radiacion);
                String bar = "#".repeat(i) + "-".repeat(50 - i); // Corregido: simplificación para generar la barra
                System.out.print("\r" + bar + " " + progress + " de " + radiacion + " (msv)");
            }
            System.out.println("\nProceso de irradiación completado.");
        }
    }


}
