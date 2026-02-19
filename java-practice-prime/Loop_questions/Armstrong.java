
public class Armstrong {
    public static double armstrong(int num){
        int count=0;
        int org=num;
        while(num>0){
            count++;
            num/=10;
        }
        double arm=0;
        while(org>0){
            int rem=org%10;
            arm+=Math.pow(rem, count);
            org/=10;
        }

        return arm;
    }
    public static void main(String[] args) {
        int num=153;
        double res=armstrong(num);
        if(num==res){
        System.out.println("armstrong no"+" "+res);
        }else{
            System.out.println("not armstrong");
        }
    }
    
}
