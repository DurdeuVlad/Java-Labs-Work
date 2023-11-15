public class Main {

    public static void main(String[] args) {
        Ghiozdan g = new Ghiozdan();
        for (int i = 0; i < 5; i++) {
            g.add(new Caiet("c"+i));
            g.add(new Manual("m"+i));
        }
        g.getNrRechizite();
        g.getNrCaiete();
        g.getNrManuale();
        g.list();
        g.listManual();
        g.listCaiete();
    }
}

