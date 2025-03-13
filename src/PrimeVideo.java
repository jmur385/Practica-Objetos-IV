import java.util.ArrayList;

public class PrimeVideo {

    private ArrayList<Multimedia> catalogo;
    private ArrayList<Cliente> suscriptores;
    private Double ganancias;

    public PrimeVideo() {
        this.catalogo = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancias = 0.0;
    }

    public ArrayList<Cliente> getSuscriptores() {
        return suscriptores;
    }

    public ArrayList<Multimedia> getCatalogo() {
        return catalogo;
    }

    /**
     * Añade un suscriptor a la lista
     * @param c Cliente
     */

    public void addSuscriptor(Cliente c) {
        int posicion = this.suscriptores.indexOf(c);

        if (posicion < 0) {
            this.suscriptores.add(c);
        }
    }

    /**
     * Añade una serie/película al catálogo
     * @param m Multimedia
     */

    public void addMultimedia(Multimedia m) {
        int posicion = this.catalogo.indexOf(m);

        if (posicion < 0) {
            this.catalogo.add(m);
        }
    }

    /**
     * Suma el precio de la serie/película
     * a las ganancias totales
     * @param m Multimedia
     * @param c Cliente
     */

    public void ver(Multimedia m, Cliente c){
        if (!c.esPro()){
            this.ganancias += m.getPrecio();
        }
    }

    /**
     * Suma para conseguir cuanto
     * dinero se ha conseguido en un año
     *
     * @return total de ganancias entre
     * las suscripciones y las series/películas
     *
     * (pagas por cada serie y por una suscripción?? Menuda estafa...)
     */

    public Double getGanancias() {
        double gananciasSucriptores = 0.0;
        for (Cliente cliente : suscriptores) {
            gananciasSucriptores += cliente.getPrecioMensual() * 12;
        }
        return (ganancias +  gananciasSucriptores);
    }
}
