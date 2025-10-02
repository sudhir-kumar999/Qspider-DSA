
public class q11 {
    public static void main(String[] args) {
        int n=5;
        int mid =n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=mid &&i==0 || i==n/2 || j==n/2 || i>=mid&&j==n-1 || i==n-1&&j<=mid || j==0&&i<=mid){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
