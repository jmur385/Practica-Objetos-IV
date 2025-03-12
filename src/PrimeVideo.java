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

    public ArrayList<Multimedia> getCatalogo() {
        return catalogo;
    }

    /**
     *
     */

    public void addSuscriptor(Cliente c) {
        int posicion = this.suscriptores.indexOf(c);

        if (posicion < 0) {
            this.suscriptores.add(c);
        }
    }

    public void addMultimedia(Multimedia m) {
        int posicion = this.catalogo.indexOf(m);

        if (posicion < 0) {
            this.catalogo.add(m);
        }
    }

    public void ver(Multimedia m, Cliente c){
        if (!c.esPro()){
            this.ganancias += m.getPrecio();
        }
    }

    public Double getGanancias() {
        double gananciasSucriptores = 0.0;
        for (Cliente cliente : suscriptores) {
            gananciasSucriptores += cliente.getPrecioMensual() * 12;
        }
        return (ganancias +  gananciasSucriptores);
    }
}
