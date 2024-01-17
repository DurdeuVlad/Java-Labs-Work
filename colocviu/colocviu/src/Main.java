
public class Main {
    public static void main(String[] args) {
        ServiciuStreamingFilme serviciuStreamingFilme = new ServiciuStreamingFilme();
        // adaugam filme
        for (int i = 0; i < 5; i++) {
            serviciuStreamingFilme.addFilm(new Film(i));
        }
        for (int i = 5; i < 8; i++) {
            serviciuStreamingFilme.addFilm(new EpisodSerial(i));
        }
        serviciuStreamingFilme.showFilmeList();
        // stergem filme
        serviciuStreamingFilme.removeFilm(2);
        serviciuStreamingFilme.removeFilm(3);
        serviciuStreamingFilme.removeFilm(5);
        serviciuStreamingFilme.removeFilm(7);
        serviciuStreamingFilme.removeFilm(8);
        serviciuStreamingFilme.showFilmeList();

        // adauga abonati
        for (int i = 0; i < 5; i++) {
            serviciuStreamingFilme.addAbonati(new Abonat(i));
        }
        serviciuStreamingFilme.showAbonatiList();

        // stergem abonati
        serviciuStreamingFilme.removeAbonat(0);
        serviciuStreamingFilme.removeAbonat(4);
        serviciuStreamingFilme.removeAbonat(5);
        serviciuStreamingFilme.showAbonatiList();

        // cauta un film
        System.out.println(serviciuStreamingFilme.cautaFilm(1).toString());

        System.out.println("\nun abonat premium vrea sa adauge un film care e disponibil la wishlist si sa se uite la el");

        // un abonat premium vrea sa adauge un film care e disponibil la wishlist si sa se uite la el
        try {
            serviciuStreamingFilme.getAbonat(1).adaugaFilmInWishList(serviciuStreamingFilme.cautaFilm(0));
            serviciuStreamingFilme.getAbonat(1).afiseazaListaWishList();
            serviciuStreamingFilme.getAbonat(1).vizualizeazaFilm(serviciuStreamingFilme.cautaFilm(0));
            serviciuStreamingFilme.getAbonat(1).afiseazaListaAlreadyWatched();
            serviciuStreamingFilme.getAbonat(1).afiseazaListaWishList();
        } catch (PremiumNotEnabledException | FilmIndisponibilException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        System.out.println("\nun abonat non-premium vrea sa se uite la un film care e disponibil");
        // un abonat non-premium vrea sa se uite la un film care e disponibil
        serviciuStreamingFilme.cautaFilm(1).setEsteDisponibil(true);
        try {
            serviciuStreamingFilme.getAbonat(2).vizualizeazaFilm(serviciuStreamingFilme.cautaFilm(1));
            serviciuStreamingFilme.getAbonat(2).afiseazaListaAlreadyWatched();
        } catch (FilmIndisponibilException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }

        System.out.println("\nun abonat non-premium vrea sa adauge un film care e disponibil la wishlist si sa se uite la el");
        // un abonat non-premium vrea sa adauge un film care e disponibil la wishlist si sa se uite la el
        serviciuStreamingFilme.getAbonat(2).schimbaAbonament(Abonamente.Standard);
        try {
            serviciuStreamingFilme.getAbonat(2).adaugaFilmInWishList(serviciuStreamingFilme.cautaFilm(1));
            serviciuStreamingFilme.getAbonat(2).afiseazaListaWishList();
        } catch (PremiumNotEnabledException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        System.out.println("\nun abonat non-premium vrea sa se uite la un film care e indisponibil");
        serviciuStreamingFilme.cautaFilm(1).setEsteDisponibil(false);
        // un abonat non-premium vrea sa se uite la un film care e indisponibil
        try {
            serviciuStreamingFilme.getAbonat(2).vizualizeazaFilm(serviciuStreamingFilme.cautaFilm(1));
            serviciuStreamingFilme.getAbonat(2).afiseazaListaAlreadyWatched();
        } catch (FilmIndisponibilException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }

        System.out.println("Cate comedii sunt in serviciul de streaming? " + serviciuStreamingFilme.getNumberComedieFilms());
        serviciuStreamingFilme.showFilmeList();

        System.out.println("Afiseaza detalii film: ");
        serviciuStreamingFilme.cautaFilm(0).afiseazaDetalii();

        System.out.println("Un abonat vrea sa isi modifice abonamentul: ");
        System.out.println(serviciuStreamingFilme.getAbonat(2).toString());
        serviciuStreamingFilme.getAbonat(2).schimbaAbonament(Abonamente.Premium);
        System.out.println(serviciuStreamingFilme.getAbonat(2).toString());
        serviciuStreamingFilme.getAbonat(2).schimbaAbonament(Abonamente.Standard);
        System.out.println(serviciuStreamingFilme.getAbonat(2).toString());


    }
}