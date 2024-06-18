import ccAgnathan.ccHagfish;
import ccFanerozoico.ccHagfissh;
import ccProterozoico.ccWaiting;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("ARBOL FILOGENETICO: ");
        
        ccWaiting ccWaiting = new ccWaiting();
        ccWaiting.ccL();

        ccHagfissh ccHagfissh = new ccHagfissh();
        ccHagfish hagfish = new ccHagfish("");
        System.out.println(hagfish.ccgetNombre() + " es un hagfish");
        System.out.println(hagfish.ccComer());
        System.out.println(hagfish.ccComerC());

        ccTanqueMutacion tanqueMutacion = new ccTanqueMutacion();

        // Llamar al método ccMutar con el nombre del hagfish
        tanqueMutacion.ccMutar("HagfishCaicedo");
    }
}
