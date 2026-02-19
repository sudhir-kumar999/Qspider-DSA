
public class Sum_of_n_no {
    public static int sum(int num){
        int sum=0;
        for(int i=num;i>0;i--){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int res=sum(5);
        System.out.println(res);
    }
}
