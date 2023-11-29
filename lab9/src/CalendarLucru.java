import java.util.ArrayList;
import java.util.List;

public class CalendarLucru {
    List<Zi> zile;

    public CalendarLucru() {
        zile = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            boolean working = true;
            if(DAY.Luni.ordinal()+i >= DAY.Sambata.ordinal()) working=false;
            this.zile.add(new Zi(DAY.values()[i], working));
        }
    }

    public List<Zi> getZile() {
        return zile;
    }

    public void setZile(List<Zi> zile) {
        this.zile = zile;
    }

    public void addZile(Zi zi){
        zile.add(zi);
    }

    public Zi getZile(DAY zi){
        for(Zi day : zile){
            if(day.getName().equals(zi)) return day;
        }
        return null;
    }

    @Override
    public String toString() {
        return "CalendarLucru{" +
                "zile=" + zile +
                '}';
    }
}
