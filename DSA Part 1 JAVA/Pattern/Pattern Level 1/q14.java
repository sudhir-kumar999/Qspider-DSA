
public class q14 {
    public static void main(String[] args) {
        int n=7;
        int star = 1;
        int space = n-1;

        for(int i=1;i<=n;i++){

            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            
            star++;
            space--;
            System.out.println();
        }
    }
    
}
