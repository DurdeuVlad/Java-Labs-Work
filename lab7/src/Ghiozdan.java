import java.util.ArrayList;
import java.util.List;

public class Ghiozdan {


    List<Rechizita> rechizitaList = new ArrayList<>(0);

    void add(Rechizita rechizita){
        rechizitaList.add(rechizita);
    }

    void listCaiete(){
        for(Rechizita rechizita : rechizitaList){
            if(rechizita instanceof Caiet)
                System.out.println(rechizita.getNume());
        }
    }
    void getNrCaiete(){
        int nr =0;
        for(Rechizita rechizita : rechizitaList){
            if(rechizita instanceof Caiet)
                nr++;
        }
        System.out.println("Numar caiete: "+ nr);
    }
    void getNrManuale(){
        int nr =0;
        for(Rechizita rechizita : rechizitaList){
            if(rechizita instanceof Manual)
                nr++;
        }
        System.out.println("Numar caiete: "+ nr);
    }
    void listManual(){
        for(Rechizita rechizita : rechizitaList){
            if(rechizita instanceof Manual)
                System.out.println(rechizita.getNume());
        }
    }
    void list(){
        for(Rechizita rechizita : rechizitaList){
            System.out.println(rechizita.getNume());
        }
    }

    void getNrRechizite(){
        System.out.println(rechizitaList.size());
    }

}

