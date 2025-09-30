public class Length {
    public static void main(String[] args) {
        int num = 2345;
        String str = String.valueOf(num); // convert to string
        System.out.println(str.length());

        // another way to convert integer into string

        int num2 = 345667;
        String str2= num2+"";
        System.out.println(str2);
        System.out.println(str2.getClass().getSimpleName());
    }
    
}
