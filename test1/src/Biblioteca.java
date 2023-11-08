public class Biblioteca {
    private Carte[] carti;

    public Biblioteca(int number) {
        this.carti = new Carte[number];
    }

    void adaugaCarte(Carte carte){
        if (carte.getCopiiDisponibile() <= 0) return;
        int i=0; boolean foundEmptyPosition = false;
        for(Carte c : carti){
            if(c == null) {
                foundEmptyPosition = true;
                continue;
            }
            if(c.getID()==carte.getID()) return;
            if(!foundEmptyPosition) i++;
        }
        if(!foundEmptyPosition) {
            System.out.println("Biblioteca e full!");
            return;
        }
        carti[i%carti.length] = carte;
    }

    void listeazaCarti(){
        int i = -1;
        for(Carte carte : carti){
            i++;
            if(carte == null){
                System.out.println(i+". NULL");
                continue;
            }
            System.out.println(i+". "+carte.toString());

        }
    }

    Carte gasesteCarteDupaTitlu(String title){
        for(Carte carte : carti){
            if(carte == null) continue;
            if (carte.getTitlu().compareTo(title)==0)
            {
                System.out.println("A fost gasita cartea: "+ carte.toString());
                return carte;
            }
        }
        System.out.println("Nu a fost gasita cartea cu titlul \""+ title+"\"");
        return null;
    }
}
