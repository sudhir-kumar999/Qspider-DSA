import java.util.Arrays;
// not solved

public class Anagram {
    public static void main(String[] args) {
        String str = "kumuk sudhir hajipur pop dhirsu";
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
           // System.out.println(split[i]);
            //char[] ch = split[i].toCharArray();
            //Arrays.sort(split);

            for (int j = 0; j < split.length; j++) {
            
                String word1=split[i];
                String word2=split[j];
                //System.out.println(word1);
                //System.out.println(word2);
                if (word1.length() != word2.length()) continue;
                char[] ch1 =word1.toCharArray();
                char[] ch2 = word2.toCharArray();
                //System.out.println(ch1);
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                //System.out.println(ch1);

                if(Arrays.equals(ch1, ch2)){
                    System.out.println(word1+"=>"+word2);
                }

            }

        }
    }

}
