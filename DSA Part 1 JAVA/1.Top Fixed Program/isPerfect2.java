public class isPerfect2 {
    public static void main(String[] args) {
        int count =0;
        int start = 4;
        int end = 50000000;
        for(int i=start;i<=end ;i++){
            if(checkPerfect(i)){
                System.out.println(i+" ");
                count ++;
            }
        }
        System.out.println("total count is "+ count);
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
