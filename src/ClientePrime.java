public class ClientePrime extends Cliente {

    public ClientePrime(String dni, String nombre, String email) {
        super(dni, nombre, email);
        this.precioMensual = 3.0;
    }

    @Override
    public boolean esPro() {
        return false;
    }

    @Override
    public double getPrecioMensual() {
        return 3.0;
    }
}
