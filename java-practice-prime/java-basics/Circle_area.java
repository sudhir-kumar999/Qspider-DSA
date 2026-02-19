
public class Circle_area {

        double rad;

    public static double area(int x){
        double rad=3.1742*x*x;

        return rad;
    }
    public static void main(String[] args) {
        double res=area(5);
        System.out.println(res);
    }
}
