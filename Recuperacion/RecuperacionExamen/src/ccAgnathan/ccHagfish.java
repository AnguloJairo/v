package ccAgnathan;

public class ccHagfish {

    private String nombre;

    public ccHagfish(String nombre) {
        this.nombre = nombre;
    }

    public String ccgetNombre() {
        return nombre;
    }

    public void ccsetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String ccComer() {
        return nombre + " come.";
    }

    public String ccComerC() {
        return nombre + " come de nuevo.";
    }

}
