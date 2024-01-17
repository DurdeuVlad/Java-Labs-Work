import java.util.HashMap;
import java.util.Map;

public class ServiciuStreamingFilme {
    private Map<String, Film> movies;
    private Map<String, Abonat> subscribers;

    int numberComedieFilms = 0;

    public ServiciuStreamingFilme() {
        movies = new HashMap<>();
        subscribers = new HashMap<>();
    }

    public void addFilm(Film film){
        if(movies.containsKey(film.getMovieID()+""))
            film.setMovieID(movies.size());
        movies.put(film.getMovieID()+"", film);
        if(film.getGen()==GenuriFilme.Comedie)
            numberComedieFilms++;
    }

    public void removeFilm(int id){
        Film film = movies.get(id+"");
        if(movies.remove(id+"")!=null)
            if(film.getGen()==GenuriFilme.Comedie)
                numberComedieFilms--;
    }

    public void addAbonati(Abonat abonat){
        if(subscribers.containsKey(abonat.getSubscriberId()+""))
            abonat.setSubscriberId(movies.size());
        subscribers.put(abonat.getSubscriberId()+"", abonat);
    }

    public void removeAbonat(int id){
        subscribers.remove(id+"");
    }

    public int getNumberComedieFilms() {
        return numberComedieFilms;
    }

    public Film cautaFilm(int id){
        return movies.get(id+"");
    }

    public void showFilmeList(){
        for (Film film : movies.values()){
            System.out.println("id:" + film.getMovieID()+ " - " +film.toString());
        }
    }

    public void showAbonatiList(){
        for (Abonat abonat : subscribers.values()){
            System.out.println("id:" + abonat.getSubscriberId()+ " - " +abonat.toString());
        }
    }

    public Abonat getAbonat(int id){
        return subscribers.get(1+"");
    }
}
