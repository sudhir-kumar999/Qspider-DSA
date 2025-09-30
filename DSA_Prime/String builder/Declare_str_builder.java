//package String builder;

public class Declare_str_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sudhir");

        // print char at given index
        System.out.println(sb.charAt(4));

        // Replace character at given index
        sb.setCharAt(4, 's');
        System.out.println(sb);

        sb.insert(0, 'k');
        System.out.println(sb);
        sb.insert(3, 'd');
        System.out.println(sb);

        // delete extra d of start element
        sb.delete(3, 4);
        System.out.println(sb);

        // add element at last
        sb.append(" kumar ");
        System.out.println(sb);
        sb.append("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);
        for(int i=0;i<sb.length();i++){
            System.out.println(sb);
        }
    }

}
