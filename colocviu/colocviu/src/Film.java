import java.util.Random;

public class Film {
    int movieID;
    String titlu;
    GenuriFilme gen;
    double durata;
    boolean esteDisponibil;

    public Film(int movieID, String titlu, GenuriFilme gen, double durata, boolean esteDisponibil) {
        this.movieID = movieID;
        this.titlu = titlu;
        this.gen = gen;
        this.durata = durata;
        this.esteDisponibil = esteDisponibil;
    }

    /***
     * for generating random test data
     * @param movieID
     */
    public Film(int movieID) {
        this.movieID = movieID;
        this.titlu = "Test film "+movieID;
        gen = GenuriFilme.values()[movieID%4];
        Random random = new Random();
        durata = random.nextInt(60, 300);
        esteDisponibil = movieID%2==0;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public GenuriFilme getGen() {
        return gen;
    }

    public void setGen(GenuriFilme gen) {
        this.gen = gen;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public boolean isEsteDisponibil() {
        return esteDisponibil;
    }

    public void setEsteDisponibil(boolean esteDisponibil) {
        this.esteDisponibil = esteDisponibil;
    }

    public void afiseazaDetalii(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Film{" +
                "movieID=" + movieID +
                ", titlu='" + titlu + '\'' +
                ", gen='" + gen + '\'' +
                ", durata=" + durata +
                ", esteDisponibil=" + esteDisponibil +
                '}';
    }
}
