import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie un numar: ");
        int citire = scanner.nextInt();
        System.out.println("Ai scris "+citire);
        byte[] a = new byte[20];
        BigInteger bigInteger = new BigInteger(a);
        for(int i=0;i<citire;i++){
           bigInteger = bigInteger.add(BigInteger.TWO.pow(i));
        }
        System.out.println(bigInteger.toString());
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE+10);
//        System.out.println(Double.MAX_VALUE + 1);
//        System.out.println(Double.MAX_VALUE / 0);
        // incarcam 6.6 pe git saptamana viitoare pt bonus
    }


}