import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Defining array
    static int[] arr = {1, 87, 99, 100, 150, 40, 23, 33, 44, 60};

    static void getValueWithIndex(int index) {
        //Process try-catch
        try {
            int getValue = arr[index];
            System.out.println("Dizinin " + index + "'inci elemanı : " + getValue);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi 10 boyutlu olup boyut dışında değer girdiniz. Lütfen 0 - 9 arasında değer giriniz !");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //Defining variable
        int indis;

        //Calling Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("İndis numarasını giriniz : ");

        try {
            indis = input.nextInt();
            getValueWithIndex(indis);
        } catch (InputMismatchException e) {
            System.out.println("Int türünde değer girmeniz gerekmektedir.");
        }

    }
}