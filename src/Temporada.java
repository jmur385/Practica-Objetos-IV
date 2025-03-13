import java.util.ArrayList;

public class Temporada {

    private Integer numero;
    private ArrayList<Episodio> episodios;
    private Serie serie;

    public Temporada(Integer numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Temporada{");
        sb.append("numero=").append(numero);
        sb.append(", serie=").append(serie);
        sb.append(", episodios=").append(episodios);
        sb.append('}');
        return sb.toString();
    }

    public int getNumeroEpisodios(){
        return episodios.size();
    }

    /**
     * Añade un episodio a la temporada
     * @param episodio
     */

    public void addEpisodio(Episodio episodio) {
        episodio.setTemporada(this);
        this.episodios.add(episodio);
    }

    /**
     * Borra un episodio a la temporada
     * @param episodio
     */

    public void delTemporada(Episodio episodio) {
        episodios.remove(episodio);
    }

}
