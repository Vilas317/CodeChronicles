public class RomantoInteger {
    public static int getVal(char ch) {
        switch(ch) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    public static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            if((i + 1) < n && getVal(ch1) < getVal(s.charAt(i + 1))) {
                sum = sum - getVal(ch1);
            } else {
                sum = sum + getVal(ch1);
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        String[] testCases = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        
        System.out.println("✅ Roman to Integer Conversion:");
        for (String roman : testCases) {
            int result = romanToInt(roman);
            System.out.println(roman + " → " + result);
        }
    }
}