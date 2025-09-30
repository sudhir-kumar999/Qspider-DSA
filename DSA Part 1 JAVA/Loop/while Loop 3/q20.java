public class q20 {
    public static void main(String[] args) {
        int n = 25681;
        int small =n%10;
        boolean inc = false;
        while(n>0){
            int rem = n%10;
            if(rem<small){
                small=rem;
                inc = true;
            } else{
                inc = false;
                break;
            }
            n/=10;
        }
        if(inc == true){
            System.out.println("no is in increasing order");
        }else{
            System.out.println("no is not in increasing order");

        }
    }
    
}
