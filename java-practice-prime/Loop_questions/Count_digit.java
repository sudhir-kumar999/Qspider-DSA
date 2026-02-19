
public class Count_digit {
    public static int count(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int res=count(123654);
        System.out.println(res);
    }
    
}
