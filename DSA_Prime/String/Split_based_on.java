public class Split_based_on {
    public static void main(String[] args) {
        String str = "sudhir,kumar,web,development,fresher";
        String[] arr=str.split(",");
        for(String word :arr){
            System.out.println(word);
        }
    }
    
}
