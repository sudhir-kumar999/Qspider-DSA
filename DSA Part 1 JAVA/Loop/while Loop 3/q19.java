
public class q19 {
    public static void main(String[] args) {
        int n = 9775;
        boolean hasEven = false;
        // int sum = 0;
        while(n>0){
            int rem = n%10;
            if(rem%2==0){
                hasEven=true;
            }
            else{
                hasEven=false;
            }
            n/=10;
        }
        if(hasEven==true){
            System.out.println("product is even");
        }else{
            System.out.println("product is odd");
        }
        
    }
    
}

