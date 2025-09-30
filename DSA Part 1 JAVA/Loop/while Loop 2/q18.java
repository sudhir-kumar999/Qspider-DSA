
public class q18 {
    public static void main(String[] args) {
        double i=1;
        double sum =0;
        while(i<=100){
            sum+=1/(i*i+1);
            i+=2;
        }
        System.out.println(sum);
    }
    
}
