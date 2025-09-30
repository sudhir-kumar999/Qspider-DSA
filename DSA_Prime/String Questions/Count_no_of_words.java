//package String Questions;

public class Count_no_of_words {

    public static void main(String[] args) {
        String str = "i love my bihar and india also";

        String[] split = str.split(" ");
        //to find length
        System.out.println(split.length);
        // to print the array
        for(int i=0;i<split.length;i++){
        System.out.println(split[i]);
        }

    }

}
