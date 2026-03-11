import java.util.Scanner;

public class Main {
    public static  void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add quantity number for send");

        int vectorLength = sc.nextInt();

        if (vectorLength > 10) {
            System.out.println("Number should is max 10");
            sc.close();
            return;
        }

        int[] arrayNumber = new int[vectorLength];

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Add number: ");
            arrayNumber[i] = sc.nextInt();
        }

        System.out.println("Numbers Negatives");
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] < 0)
                System.out.println(arrayNumber[i]);
        }
        
        System.out.println("Numbers Positives");
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > 0)
                System.out.println(arrayNumber[i]);
        }


        sc.close();
    }
}
