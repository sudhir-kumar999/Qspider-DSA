public class q1{
    public static void main(String[] args){
        int n= 5783;
        //  To print last digit of the number
        int x = n%10;
        System.out.println(x);

        // To print last two digit of the number
        int y= n%100;
        System.out.println(y);

        // To remove last digit of the number
        int z=n/10;
        System.out.println(z);

        // To remove last two digit of a number
        int a=n/100;
        System.out.println(a);

    }

}