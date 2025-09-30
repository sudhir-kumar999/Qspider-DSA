import java.util.HashSet;

public class Rmv_first_rpt_ele {
    public static void main(String[] args) {
        String str = "sudhird";
        HashSet<Character> set = new HashSet<>();

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            // System.out.println(ch[i]);
            if (set.contains(ch[i])) {
                System.out.print(ch[i]);
                break;
            } 
            else {
                set.add(ch[i]);
            }

        }
        //System.out.println(set);
    }
}
