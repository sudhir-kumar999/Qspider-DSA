
public class q2 {
    public static void main(String[] args) {
        // if all are equal then print or print biggest of three
        int a=10;
        int b=50;
        int c=40;
        if(a==b && a==c){
            System.out.println("all three number are same");
        }
        else if(a>b && a>c){
            System.out.println("a is greater among all");
        }
        else if(b>c){
            System.out.println("b is greater than all");
        }
        else{
            System.out.println("c is greater than all");
        }
    }
    
}
