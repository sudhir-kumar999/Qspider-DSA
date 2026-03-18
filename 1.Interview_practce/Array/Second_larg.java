public class Second_larg {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,5,4,6,65,556,809};
        int largest=0;
        int secLarg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secLarg && arr[i]<largest){
                secLarg=arr[i];
            }
        }
        System.out.println(secLarg);
    }
}
