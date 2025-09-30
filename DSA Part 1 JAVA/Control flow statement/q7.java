import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        // take input to check it is valid triangle or not using side
        System.out.println("Enter length of side to check valid or not");
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                System.out.println("it is valid");
            }
            else {
            System.out.println("it is not valid");

        }

        } else {
            System.out.println("it is not valid");

        }
    }

}
