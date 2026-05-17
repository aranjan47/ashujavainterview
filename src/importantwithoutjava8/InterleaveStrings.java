package importantwithoutjava8;
public class InterleaveStrings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "programming";

        StringBuilder result = new StringBuilder();

        int maxLength = Math.max(str1.length(), str2.length());
        
        System.out.println(+maxLength);

        for (int i = maxLength; i > 0; i--) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
                
            }
            if (i < str2.length()) {
                result.append(str2.charAt(i));
            }
        }

        System.out.println("Interleaved string: " + result.toString());
    }
}
