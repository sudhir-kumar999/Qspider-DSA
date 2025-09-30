//package String Questions;

public class Math_min_fn {
    public static void main(String[] args) {
        String str = "welcometojavaclasses";
        for (int i = 0; i < str.length(); i += 3) {
            int end = Math.min(i + 3, str.length());
            //System.out.println(end);
            String chunk = str.substring(i, end);
            System.out.println(chunk);
        }
    }

}
