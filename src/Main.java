import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Defining variable
        int indis;

        //Defining array
        int[] arr = {1, 87, 99, 100, 150, 40, 23, 33, 44, 60};

        //Calling Scanner class
        Scanner input = new Scanner(System.in);

        //Process try-catch
        try {
            System.out.print("İndis numarasını giriniz : ");
            indis = input.nextInt();

            int getValue = arr[indis];
            System.out.println("Dizinin " + indis + "'inci elemanı : " + getValue);

        } catch (InputMismatchException e) {
            System.out.println("Int türünde değer girmeniz gerekmektedir.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi 10 boyutlu olup boyut dışında değer girdiniz. Lütfen 0 - 9 arasında değer giriniz !");
            System.out.println(e.getMessage());
        }


    }
}