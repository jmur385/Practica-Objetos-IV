public class Test {
    public static void main(String[] args) {

        PrimeVideo empresa = new PrimeVideo();

        for (int i = 1; i <= 200; i++) {
            if (i <= 30) {
                Multimedia pelicula = new Multimedia("Película nº " + i,
                        true, 10.0);
                empresa.addMultimedia(pelicula);
            } else {
                Multimedia pelicula = new Multimedia("Película nº " + i,
                        false, 7.50);
                empresa.addMultimedia(pelicula);
            }
        }

        int totalClientes = 10000; //sé que son un millón pero genuinamente
                                  // no me funciona el programa si no :(
        int cPrimePro = (int) (totalClientes * 0.25);
        int cPrime = totalClientes - cPrimePro;

        for (int i = 1; i <= cPrime; i++) {
            ClientePrime c = new ClientePrime("DNI nº " + i,
                    "cliente nº " + i,
                    "cliente" + i + "@gmail.com");
            empresa.addSuscriptor(c);
        }

        for (int i = 1; i <= cPrimePro; i++) {
            ClientePrimePro c = new ClientePrimePro("DNI cPro nº " + i,
                    "cliente pro nº " + i,
                    "clientepro" + i + "@gmail.com");
            empresa.addSuscriptor(c);
        }

        for (Cliente cliente : empresa.getSuscriptores()) {
            for (int i = 0; i < 40; i++) {
                Multimedia pelicula = empresa.getCatalogo().get(i);
                empresa.ver(pelicula, cliente);
            }
        }

        System.out.println("Se han conseguido " + (empresa.getGanancias())
                + " euros en ganancias con pelis y suscripciones");

        Serie serie1 = new Serie("Breaking Bad", true, 10.0, Genero.THRILLER);
        for(int i=0; i<10; i++) {
            Temporada t = new Temporada(i);
            for(int j=0; j<10; j++) {
                t.addEpisodio(new Episodio("Episodio "+j, 50));
            }
            serie1.addTemporada(t);
        }

        Serie serie2 = new Serie("Better Call Saul", true, 10.0, Genero.THRILLER);
        for(int i=0; i<6; i++) {
            Temporada t = new Temporada(i);
            for(int j=0; j<10; j++) {
                t.addEpisodio(new Episodio("Episodio "+j, 50));
            }
            serie2.addTemporada(t);
        }

        for (int i = 3; i <= 10; i++) {
            Serie serie = new Serie("Serie ", false, 7.50, Genero.COMEDIA);
            for(int j = 0; j <6; j++) {
                Temporada t = new Temporada(j);
                for(int k = 0; k <10; k++) {
                    t.addEpisodio(new Episodio("Episodio "+ k, 20));
                }
                serie.addTemporada(t);
            }

        }

        for (Cliente cliente : empresa.getSuscriptores()) {
            for (int i = 0; i < 5; i++) {
                Multimedia serie = empresa.getCatalogo().get(i);
                empresa.ver(serie, cliente);
            }
        }

        System.out.println("Se han conseguido " + (empresa.getGanancias())
                + " euros en ganancias con pelis, series y suscripciones");

    }
}
