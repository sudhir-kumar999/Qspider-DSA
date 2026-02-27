
public class Star {
    public static void main(String[] args) {
        int n = 5;
        // triangle
        // for(int i=0;i<n;i++){
        // for(int j=0;j<=i;j++){
        // System.out.print("* ");
        // }
        // System.out.println();

        // ulta triangle
        // for(int i=0;i<n;i++){
        // for(int j=i;j<=n;j++){
        // System.out.print("* ");
        // }
        // System.out.println();

        // }
        // square box
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
