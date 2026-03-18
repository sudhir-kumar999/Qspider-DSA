
public class Count_od_ev {
    public static void main(String[] args) {
        int[] arr={1,5,46,9,8,7,5,6,8};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even "+even +" Odd "+odd);
    }
}
