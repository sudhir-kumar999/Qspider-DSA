
public class q9 {
    public static void main(String[] args) {
        
        int n=28;
        int i= 1;
        int factCount =0;
        while(i<n){
            if(n%i==0){
                System.out.println(i);
                factCount++;
            }
            i++;
        }
        System.out.println("Total factor : "+factCount);
    
    }
    
}
