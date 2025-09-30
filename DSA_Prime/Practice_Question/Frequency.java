public class Frequency {
    public static void main(String[] args) {
        String str = "sudhirrsudhirsdxyz";
        char[] ch = str.toCharArray();

        boolean[] visited = new boolean[ch.length];
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) {
                // System.out.println("duplicate found" + " " + ch[i]);
                continue;
            }
            int freq = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    freq++;
                    visited[j] = true;

                }
            }

            System.out.println("frequency of char " + ch[i] + " " + freq);
            // System.out.println(ch[i]);
            if(freq>1){
            System.out.println("duplicate element is "+ch[i]);
            }else{
                System.out.println("unique is " + ch[i]);
            }
        }

    }

}
