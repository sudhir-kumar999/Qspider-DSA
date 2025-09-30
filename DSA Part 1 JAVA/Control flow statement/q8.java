import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        // to check triangle is equilateral isosceles or scalene triangle
        System.out.println("Enter sides of triangle to check its type");
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if ((side1 > 0 && side2 > 0 && side3 > 0)
                && (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Triangle is equilateral");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("Triangle is isosceles");
            } else if (side1 != side2 && side2 != side3 && side3 != side1) {
                System.out.println("Triangle is scalene");

            }
        } else {
            System.out.println("triangle is not valid");
        }
    }

}
