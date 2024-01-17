public class Abonament {
    int idAbonament;
    Abonamente tipAbonament;

    public Abonament(int idAbonament, Abonamente tipAbonament) {
        this.idAbonament = idAbonament;
        this.tipAbonament = tipAbonament;
    }

    public int getIdAbonament() {
        return idAbonament;
    }

    public void setIdAbonament(int idAbonament) {
        this.idAbonament = idAbonament;
    }

    public Abonamente getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(Abonamente tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    @Override
    public String toString() {
        return "Abonament{" +
                "idAbonament=" + idAbonament +
                ", tipAbonament=" + tipAbonament +
                '}';
    }
}

