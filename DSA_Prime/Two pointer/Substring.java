public class Substring {
    public static void main(String[] args) {
        String sentence = "My name is sudhir kumar and i live in uttar pradesh";
        String name = sentence.substring(11 , sentence.length()); // print from 12th index
        String part2 = sentence.substring(5); //print from 6 index to last
        String part3 = sentence.substring(5,15); //print from index 6 to 15
        System.out.println(name);
        System.out.println(part2);
        System.out.println(part3);
    }
}
