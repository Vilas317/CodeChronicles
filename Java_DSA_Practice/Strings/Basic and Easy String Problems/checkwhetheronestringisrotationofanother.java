public class checkwhetheronestringisrotationofanother {
    public static int isCyclicRotation(String p, String q) {
        if(p.length() != q.length()) {
            return 0;
        }
        String concat = p + p;
        if(concat.contains(q)) {
            return 1;
        } else {
            return 0;
        }
    }
    
public static void testCases() {
    String[][] tests = {
        {"abcd", "cdab"}, 
        {"abcd", "acbd"},
        {"aaa", "aaa"},  
        {"abc", "bca"},
        {"abc", "cab"},  
        {"abc", "acb"}  
    };

    for (String[] test : tests) {
        String p = test[0];
        String q = test[1];
        int result = isCyclicRotation(p, q);
        System.out.println("p = " + p + ", q = " + q + " → Output: " + result);
    }
}

public static void main(String[] args) {
    testCases();
}
}
