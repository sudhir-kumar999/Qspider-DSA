
public class q2 {
    public static void main(String[] args) {
        int i=2;
        int sum=0;
        while(i<=100){
            // first method
            // if(i%2==0){
            //     sum+=i;
            // }
            // i++;

            // second method
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
    
}
