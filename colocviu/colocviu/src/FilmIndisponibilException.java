public class FilmIndisponibilException extends Exception {
    public FilmIndisponibilException(Film film) {
        super("Filmul " + film.titlu + " este indisponibil!");
    }
}
