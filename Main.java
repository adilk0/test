public class Main{
    public static void main(String[] args) {
        String str = "echeen araj java";
        
        char[] ch = str.toCharArray();
        int start = 0, end = str.length() - 1;

        while(start < end){
            // Swap characters at start and end indices
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }

        System.err.println("Reversed String: " + new String(ch));
    }
}