import java.util.ArrayList;
import java.util.List;

public class Abonat {
    int subscriberId;
    String nume;
    Abonament abonament;
    List<Film> wishList, alreadyWatchedList;

    public Abonat(int subscriberId) {
        this.subscriberId = subscriberId;
        nume = "Abonat test "+subscriberId;
        abonament = new Abonament(subscriberId, Abonamente.values()[subscriberId%2]);
        this.wishList = new ArrayList<>();
        this.alreadyWatchedList = new ArrayList<>();
    }

    public Abonat(int subscriberId, String nume, Abonament abonament) {
        this.subscriberId = subscriberId;
        this.nume = nume;
        this.abonament = abonament;
        this.wishList = new ArrayList<>();
        this.alreadyWatchedList = new ArrayList<>();
    }

    public Abonat(int subscriberId, String nume, Abonament abonament, List<Film> wishList, List<Film> alreadyWatchedList) {
        this.subscriberId = subscriberId;
        this.nume = nume;
        this.abonament = abonament;
        this.wishList = wishList;
        this.alreadyWatchedList = alreadyWatchedList;
    }

    public void vizualizeazaFilm(Film film) throws FilmIndisponibilException {
        if(!film.isEsteDisponibil()){
            throw new FilmIndisponibilException(film);
        }
        System.out.println("Filmul "+film.toString() +" a fost vizualizat cu succes!");
        wishList.remove(film);
        alreadyWatchedList.add(film);
    }

    public void adaugaFilmInWishList(Film film) throws PremiumNotEnabledException {
        if(abonament.getTipAbonament() != Abonamente.Premium){
            throw new PremiumNotEnabledException();
        }
        if(!wishList.contains(film))
            wishList.add(film);
    }

    public void afiseazaDetaliiFilm(Film film){
        if(film == null) return;
        System.out.println(film.toString());
    }

    public void afiseazaListaAlreadyWatched(){
        System.out.println("Lista Already Watched pentru abonatul "+ this.toString());
        for(Film film : alreadyWatchedList){
            afiseazaDetaliiFilm(film);
        }
    }

    public void afiseazaListaWishList() throws PremiumNotEnabledException {

        System.out.println("Wishlist pentru abonatul "+ this.toString());
        for(Film film : wishList){
            afiseazaDetaliiFilm(film);
        }
    }

    public void modificaTipAbonament(Abonamente abonamentNou){
        abonament.setTipAbonament(abonamentNou);
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Abonament getAbonament() {
        return abonament;
    }

    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }

    public List<Film> getWishList() {
        return wishList;
    }

    public void setWishList(List<Film> wishList) {
        this.wishList = wishList;
    }

    public List<Film> getAlreadyWatchedList() {
        return alreadyWatchedList;
    }

    public void setAlreadyWatchedList(List<Film> alreadyWatchedList) {
        this.alreadyWatchedList = alreadyWatchedList;
    }

    public void schimbaAbonament(Abonamente abonamente){
        if(abonament.getTipAbonament() != abonamente)
            this.abonament = new Abonament(abonament.getIdAbonament()+1, abonamente);
    }

    @Override
    public String toString() {
        return "Abonat{" +
                "subscriberId=" + subscriberId +
                ", nume='" + nume + '\'' +
                ", abonament=" + abonament +
                ", wishList=" + wishList +
                ", alreadyWatchedList=" + alreadyWatchedList +
                '}';
    }
}
