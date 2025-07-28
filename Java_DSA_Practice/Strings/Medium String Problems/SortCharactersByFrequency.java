import java.util.*;
public class SortCharactersByFrequency {
    public static String sortByFrequency(int n, String s) {
        //Brute Force
    //     Map<Character, Integer> freqMap = new HashMap<>();
    //     for(char ch : s.toCharArray()) {
    //         freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
    //     }
    //     Character[] chars = new Character[n];
    //     for(int i = 0; i < n; i++) {
    //         chars[i] = s.charAt(i);
    //     }
    //     Arrays.sort(chars, new Comparator<Character>() {
    //         public int compare(Character a, Character b){
    //             int freqA = freqMap.get(a);
    //             int freqB = freqMap.get(b);
    //             if(freqA == freqB) {
    //                 return a - b;
    //             }
    //             return freqB - freqA;
    //         }
    //     });
    //     StringBuilder result = new StringBuilder();
    //     for(char ch : chars) {
    //         result.append(ch);
    //     }
    //     return result.toString();
    // }

    //Optimal
    Map<Character, Integer> freqMap = new HashMap<>();
    for(char c : s.toCharArray()) {
        freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }
    List<Character>[] buckets = new ArrayList[n + 1];
    for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
        char ch = entry.getKey();
        int freq = entry.getValue();
        if(buckets[freq]==null) {
            buckets[freq]=new ArrayList<>();
        }
        buckets[freq].add(ch);
    }
    StringBuilder result = new StringBuilder();
    for(int i = n; i >= 1; i--) {
        if(buckets[i] != null) {
            for(char ch : buckets[i]) {
                for(int j = 0; j < i; j++) {
                    result.append(ch);
                }
            }
        }
    }
    return result.toString();
}
    public static void main(String[] args) {

        String s1 = "bbbaaccc";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + sortByFrequency(s1.length(), s1));
        System.out.println();

        String s2 = "aabbccc";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + sortByFrequency(s2.length(), s2));
        System.out.println();

        String s3 = "abcd";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + sortByFrequency(s3.length(), s3));
        System.out.println();

        String s4 = "zzzzaaaab";
        System.out.println("Input: " + s4);
        System.out.println("Output: " + sortByFrequency(s4.length(), s4));
    }
}