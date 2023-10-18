public class Main {

    public static void count(String args){
        int c=0,v=0;
        args = args.toLowerCase();
        for(char x : args.toCharArray()){
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') v++;
            else c++;
        }
        System.out.println(v + " "+ c);
    }
    public static void main(String[] args) {
        if((0.1+0.1+0.1)==0.3){
            System.out.println("Hello world!");

        }
        else{
            System.out.println("Hellosdfasdasd world!");

        }

        String ana = "Ana are ";
        String mere = "mere. ";
        String str3 = ana+mere;
        System.out.println(str3);


        int varsta=10, inaltime=200, gen=1;
        short packetData=0;
        packetData = (short)inaltime;
        packetData |= (gen << 8);
        packetData |= (varsta << 9);

        System.out.println(packetData);

        varsta=0; inaltime=0;gen=0;
        inaltime = 0XFF & packetData;
        varsta = 0XFF & (packetData>>9);
        gen = 1 & (packetData>>8);

        System.out.println(inaltime);
        System.out.println(varsta);
        System.out.println(gen);

        count("AOLEO AAAAA VVVVV");
    }
}