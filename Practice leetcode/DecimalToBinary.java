public class DecimalToBinary {
    public static void main(String[] args) {
        int res=binary(8);
        System.out.println(res);

    }

    public static int binary(int x){
            int binary = 0;
            int place =1;
            while(x>0){
            int rem =x%2;
                
                binary=binary+rem*place;
                place*=10;
                x/=2;
            }
            return binary;
        }
    }