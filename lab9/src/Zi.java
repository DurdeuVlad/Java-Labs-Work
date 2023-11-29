public class Zi {

    DAY name;
    boolean lucratoare;

    public Zi(DAY name, boolean lucratoare) {
        this.name = name;
        this.lucratoare = lucratoare;
    }

    public DAY getName() {
        return name;
    }

    public void setName(DAY name) {
        this.name = name;
    }

    public boolean isLucratoare() {
        return lucratoare;
    }

    public void setLucratoare(boolean lucratoare) {
        this.lucratoare = lucratoare;
    }

    @Override
    public String toString() {
        return "Zi{" +
                "name=" + name +
                ", lucratoare=" + lucratoare +
                '}';
    }
}


