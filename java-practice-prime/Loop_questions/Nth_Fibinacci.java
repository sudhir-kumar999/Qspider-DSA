public class Nth_Fibinacci {
    public static void main(String[] args) {
        boolean check=true;
        int count=0;
        int a=0;
        int b=1;
        int nth=9;
        // 1st way
        // for(int i=0;i*i<100000;i++){
        //     if(count==nth){
        //         System.out.println(a);
        //     }
        // 2nd way
        for(int i=2;i<=nth;i++){

        
            int c=a+b;
            a=b;
            b=c;
            // count++;
        }
            System.out.println(b);

    }
    
}
