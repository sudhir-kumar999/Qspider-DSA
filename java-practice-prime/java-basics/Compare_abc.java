
public class Compare_abc {

    int largest =0;
    public static int largest(int a, int b , int c){
        if(a>b && b>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
        
    }
    public static void main(String[] args) {
        int res=largest(1000,205,30);
        System.out.println("largest no is"+res);
    }
    
}
