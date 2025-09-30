
public class q11 {
    public static void main(String[] args) {
        int n=101;
        int i=1;
        int factCount=0;
        while(i<=n){
            if(n%i==0){
                factCount++;
            }
            i++;
            
        }
        if(factCount==2){
                System.out.println("prime");
            } else{
                System.out.println("not prime");
            }
    }
}
