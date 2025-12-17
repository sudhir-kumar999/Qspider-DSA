
public class isPrime2 {
    public static void main(String[] args) {
    int start =0;
    int end = 200;
    int count=0;
    for(int i=start;i<=end;i++){
        if(checkPrime(i)){
            count++;
            System.out.println(i);
        }
    }
    System.out.println("Total prime number is "+ count);

    }

    public static boolean checkPrime(int n){
        if(n==1) return false;
        else if(n==2||n==3) return true;
        else if(n%2==0) return false;

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
    return true;
    }
    
}
