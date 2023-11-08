public class Carte {
    private String titlu;
    private Autor autor;
    private int ID;
    private int copiiDisponibile;


    public Carte(String titlu, Autor autor, int ID, int copiiDisponibile) {
        this.titlu = titlu;
        this.autor = autor;
        this.ID = ID;
        this.copiiDisponibile = copiiDisponibile;
    }

    public Carte() {
        this.titlu = "EMPTY";
        this.autor = new Autor();
        this.ID = -1;
        this.copiiDisponibile = 0;
    }

    public String getTitlu() {
        return titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getID() {
        return ID;
    }

    public int getCopiiDisponibile() {
        return copiiDisponibile;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCopiiDisponibile(int copiiDisponibile) {
        this.copiiDisponibile = copiiDisponibile;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor=" + autor +
                ", ID=" + ID +
                ", copiiDisponibile=" + copiiDisponibile +
                '}';
    }
}

