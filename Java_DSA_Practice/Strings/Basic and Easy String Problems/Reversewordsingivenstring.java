//import java.util.*;

public class Reversewordsingivenstring {
    //Brute Force
//     public static void main(String[] args) {
//         String s = "I can crack PBC";
//         System.out.println("After reversing words: ");
//         System.out.println(s);
//         s += " ";
//         Stack<String> st = new Stack<String>();
//         // int i;
//         String str = "";
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ' ') {
//                 st.push(str);
//                 str = "";
//             } else {
//                 str += s.charAt(i);
//             }
//         }
//         String ans = "";
//         while (st.size() != 1) {
//             ans += st.peek() + " ";
//             st.pop();
//         }
//         ans += st.peek();
//         System.out.println("After reversing words: ");
//         System.out.println(ans);
//     }

// }

//Optimal
static private String result(String s) {
    int left = 0, right = s.length() - 1;
    String temp = "";
    String ans = "";
    while(left <= right) {
        char ch = s.charAt(left);
        if(ch != ' ') {
            temp += ch;
        } else if(ch == ' ') {
            if(!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
            temp = "";
        }
        left++;
    }
    if(!temp.equals("")) {
        if(!ans.equals("")) {
            ans = temp + " " + ans;
        } else {
            ans = temp;
        }
    }
    return ans;
}
public static void main(String[] args)
{
	String st = "TUF is great for interview preparation";
	System.out.println("Before reversing words: ");
    System.out.println(st);
    System.out.println("After reversing words: ");
	System.out.print(result(st));
}
}
