public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Autor autor = new Autor("Liviu", "Rebreanu", 100);
        Autor autor2 = new Autor("Mihai", "Eminescu", 300);
        biblioteca.adaugaCarte(new Carte("Ion", autor, 1, 10)); // !
        biblioteca.adaugaCarte(new Carte("Ionel", autor, 1, 15));
        biblioteca.adaugaCarte(new Carte("Luceafaru", autor2, 2, 100)); // !
        biblioteca.adaugaCarte(new Carte("Luceafaru 2", autor2, 3, 0));
        biblioteca.adaugaCarte(new Carte("Draga mea Veronica", autor2, 4, 10)); // !

        biblioteca.listeazaCarti();

        biblioteca.gasesteCarteDupaTitlu("Ion");
        biblioteca.gasesteCarteDupaTitlu("Ionel");
    }

}

