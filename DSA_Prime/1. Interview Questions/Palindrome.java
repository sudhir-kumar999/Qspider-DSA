public class Palindrome {

    public static void main(String[] args) {

        String str = "sudhir";
        char[] ch = str.toCharArray();
        String chh = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
            chh += ch[i];
        }
        System.out.println(chh);

        if (str.equals(chh)) {
            System.out.println("given string is palindrome");
        } else {
            System.out.println("given string is not palindrome");
        }
    }

}
