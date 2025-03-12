public class Pelicula extends Multimedia {

    private Integer duracion;

    public Pelicula(String titulo, Boolean plus, Double precio, Integer duracion) {
        super(titulo, plus, precio);
        this.duracion = duracion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pelicula{");
        sb.append("duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }
}
