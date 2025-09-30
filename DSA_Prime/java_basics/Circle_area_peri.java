import java.util.Scanner;

public class Circle_area_peri {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println("Enter radius to find area and perimeter");
        Scanner input= new Scanner(System.in);
        double r=input.nextDouble();
        double area = pi*r*r;
        System.out.println("area of circle is "+ area);

        double peri =  2*pi*r;
        System.out.println("perimeter of circle is " + peri);
    }
    
}
