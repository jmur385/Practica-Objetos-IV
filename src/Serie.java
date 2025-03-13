import java.util.ArrayList;

public class Serie extends Multimedia{

    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, Boolean plus, Double precio, Genero genero) {
        super(titulo, plus, precio);
        this.temporadas = new ArrayList<>();
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Serie{");
        sb.append("temporadas=").append(temporadas);
        sb.append('}');
        return sb.toString();
    }

    public int getNumeroTemporadas() {
        return temporadas.size();
    }

    /**
     * Añade una temporada a la serie
     * @param temporada
     */

    public void addTemporada(Temporada temporada) {
        temporada.setSerie(this);
        this.temporadas.add(temporada);
    }

    /**
     * Borra una temporada a la serie
     * @param temporada
     */

    public void delTemporada(Temporada temporada) {
        temporadas.remove(temporada);
    }

}