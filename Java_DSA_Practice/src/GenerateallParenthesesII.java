import java.util.ArrayList;
import java.util.Collections;

public class GenerateallParenthesesII {
    // Main function to generate all combinations of well-formed parentheses
    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> result = new ArrayList<>();
        //Brute Force
        /*char[] current = new char[2 * A];
        generateAll(current, 0, result);
        Collections.sort(result); // Sort the result lexicographically
        return result;
    }

    // Helper function to generate all possible combinations of `(` and `)`
    private void generateAll(char[] current, int pos, ArrayList<String> result) {
        if (pos == current.length) {
            // If the string is valid, add it to the result
            if (isValid(current)) {
                result.add(new String(current));
            }
        } else {
            // Add '(' and recurse
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            // Add ')' and recurse
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    // Helper function to check if a given string is a valid parentheses string
    private boolean isValid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            // If balance goes negative, it's invalid
            if (balance < 0) {
                return false;
            }
        }
        // Valid if balance is 0
        return balance == 0;
    }

    // Main function to test the example inputs
    public static void main(String[] args) {
        GenerateallParenthesesII solution = new GenerateallParenthesesII();

        // Test case 1
        int A1 = 3;
        ArrayList<String> output1 = solution.generateParenthesis(A1);
        System.out.println("Output for A = 3:");
        System.out.println(output1);

        // Test case 2
        int A2 = 1;
        ArrayList<String> output2 = solution.generateParenthesis(A2);
        System.out.println("Output for A = 1:");
        System.out.println(output2);
    }
}*/
//Optimal approach
generateParenthesisHelper(A, 0, 0, "", result); 
Collections.sort(result);
return result;
}
private void generateParenthesisHelper(int A, int open, int close, String current, ArrayList<String> result) {
    if(current.length() == 2*A) {
        result.add(current);
        return;
    }
    if(open < A) {
        generateParenthesisHelper(A, open+1, close, current+"(", result);
    }
    if(close < open) {
        generateParenthesisHelper(A, open, close+1, current+")", result);
    }
}
public static void main(String[] args) {
    GenerateallParenthesesII solution = new GenerateallParenthesesII();

    // Test case 1
    int A1 = 3;
    ArrayList<String> output1 = solution.generateParenthesis(A1);
    System.out.println("Output for A = 3:");
    System.out.println(output1);

    // Test case 2
    int A2 = 1;
    ArrayList<String> output2 = solution.generateParenthesis(A2);
    System.out.println("Output for A = 1:");
    System.out.println(output2);
}
}
