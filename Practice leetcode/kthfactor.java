
public class kthfactor {
    public static void main(String[] args) {
        int k = 3;
        int n = 12;
        int i = 1;
        int count = 0;
        while (n > i) {
            if (n % i == 0) {

                count++;
                System.out.println(i);
                if(count>=3){
                break;
                }

            }
            i++;
        }
        
    }
}
