public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if(i >= 0) {
                sum += A.charAt(i) - '0';
                i--;
            }
            if(j >= 0) {
                sum += B.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
        
    }
    
}
