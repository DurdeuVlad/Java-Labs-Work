public class Masina implements Cloneable {
    String marca;
    String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public void revopseste(String culoare){
        this.culoare=culoare;
    }

    @Override
    public Masina clone() {
        Masina clone = new Masina(marca, culoare);
        return clone;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
