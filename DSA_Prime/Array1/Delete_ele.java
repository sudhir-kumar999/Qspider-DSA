import java.util.Scanner;

public class Delete_ele {
    public static void main(String[] args) {
        System.out.println("Enter array elements");
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to delete for array");
        int num = sc.nextInt();
        boolean found = false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                System.out.println("Element is found at index "+i);
                found =true;
                index=i;
                break;

            }
        }
        if(!found){
            System.out.println("Element not found");
        } else{
            for(int i=index;i<3;i++){
                arr[i]=arr[i+1];

            }
        }

        System.out.println("updated array is");
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
