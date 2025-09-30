import java.util.Scanner;

public class Count_pos_neg_array {
    public static void main(String[] args) {
        System.out.println("Enter no of array");
        Scanner sc = new Scanner(System.in);
        int posCount=0;
        int negCount=0;
        int zeroCount=0;
        int num = sc.nextInt();
        int[] arr= new int[100];
        for(int i=0;i<num ;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<num;i++){
            if(arr[i]>0){
                posCount++;
            } else if(arr[i]<0){
                negCount++;
            }
            else{
                zeroCount++;
            }
        }
        System.out.println("Positive no = "+posCount);
        System.out.println("Negative no = "+negCount);
        System.out.println("Zero = "+zeroCount);

    }
}
