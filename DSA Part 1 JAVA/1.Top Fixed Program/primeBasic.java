public class primeBasic {

    public static void main(String[] args) {
        isPrime(12);
    }

    
    public static void isPrime(int n){
        int count =0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count ==0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}
