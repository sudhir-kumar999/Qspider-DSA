public class isPerfect3 {
    public static void main(String[] args) {
        int count =0;
        int kth = 4;
        for(int i=2;;i++){
            if(checkPerfect(i)){
                count ++;
                if(count == kth){
                    System.out.println("kth number is " + i);
                    break;
                }
            }

        }

    }

    public static boolean checkPerfect(int n){
        if(n<6){
            return false;
        }
        int sum = 1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int fact1 = i;
                int fact2= n/i;
                if(fact1!=fact2){
                    sum=sum+fact1+fact2;
                }
                else{
                    return false;
                }
            }
        }
        return n==sum;
    }
    
}
