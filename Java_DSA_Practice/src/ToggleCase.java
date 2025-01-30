public class ToggleCase {
    public String solve(String A) {
        char[] charArray = A.toCharArray();

        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 32);
            }
            else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] + 32);
            }
        }
        return new String(charArray);
    }
}