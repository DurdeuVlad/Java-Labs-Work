import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            new Lucrator().lucreaza(DAY.Luni);
            new Lucrator().lucreaza(DAY.Duminica);
        }catch (ExceptieZiNelucratoare e){
            e.printStackTrace();
        }



        Scanner keyboard = new Scanner(System.in);
        do {
            try {
                int pin = keyboard.nextInt();
                float hash = 1 / pin;
                break;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Input another pin!");

                keyboard.next();
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("You are not allowed to input pin 0!");
            }
        }while(true);
    }
}

