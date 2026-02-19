
public class Prime {
    public static boolean prime(int num){
        if(num<2){
            return false;
        }
        else if(num==2 || num==3){
            return true;
        }
        else if(num%2==0){
            return false;
        }
        
        for(int i=3;i<num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res=prime(2);
        System.out.println(res);
    }
    
}
