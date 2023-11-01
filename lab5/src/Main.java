import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 1);
        Complex c2 = new Complex(1, 2);
        System.out.println(c1.substract(c2).toString());
        System.out.println(c1.add(c2).toString());
        System.out.println(c1.multiply(c2.im).toString());

        int[] arr = new int[3]; // shallow copy
        int[] a = arr;
        a[1] = 500;
        int[] b = arr.clone(); // real copy

        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        for (int i = 0; i < c.length/2; i++) {
            int aux = c[i];
            c[i]=c[c.length-i-1];
            c[c.length-i-1] = aux;
        }
        String string = "Test";
        char[] s = string.toCharArray();
        for (int i = 0; i < s.length/2; i++) {
            char aux = s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1] = aux;
        }
        string= Arrays.toString(s).replace(',', ' ').replace(']', ' ').replace('[', ' ').replaceAll(" ", "");
        System.out.println(Arrays.toString(c));
        System.out.println(string);
        Random random = new Random();
        Complex[][] JORDAN = new Complex[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JORDAN[i][j] = new Complex(random.nextInt()%100, random.nextInt()%100);
            }
        }
        MatriceComplex A = new MatriceComplex(JORDAN);
        MatriceComplex B = new MatriceComplex(JORDAN);

        System.out.println(A.toString());
        System.out.println(A.add(B));

    }

}
