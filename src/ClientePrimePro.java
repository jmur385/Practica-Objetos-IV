public class ClientePrimePro extends Cliente {

    public ClientePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email);
        this.precioMensual = 5.0;
    }

    @Override
    public boolean esPro() {
        return true;
    }

    @Override
    public double getPrecioMensual() {
        return 5.0;
    }
}
