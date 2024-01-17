import java.util.Random;

public class EpisodSerial extends Film{

    int numarSezon, numarEpisod;

    public EpisodSerial(int movieID, String titlu, GenuriFilme gen, double durata, boolean esteDisponibil, int numarSezon, int numarEpisod) {
        super(movieID, titlu, gen, durata, esteDisponibil);
        this.numarSezon = numarSezon;
        this.numarEpisod = numarEpisod;
    }

    public EpisodSerial(int movieID) {
        super(movieID);
        Random random = new Random();
        numarEpisod = random.nextInt(20);
        numarSezon = random.nextInt(5);
    }

    public int getNumarSezon() {
        return numarSezon;
    }

    public void setNumarSezon(int numarSezon) {
        this.numarSezon = numarSezon;
    }

    public int getNumarEpisod() {
        return numarEpisod;
    }

    public void setNumarEpisod(int numarEpisod) {
        this.numarEpisod = numarEpisod;
    }

    @Override
    public String toString() {
        return "EpisodSerial{" +
                "numarSezon=" + numarSezon +
                ", numarEpisod=" + numarEpisod +
                ", movieID=" + movieID +
                ", titlu='" + titlu + '\'' +
                ", gen='" + gen + '\'' +
                ", durata=" + durata +
                ", esteDisponibil=" + esteDisponibil +
                '}';
    }
}
