public class Numberof1Bits {
    public int numSetBits(int A) {
        int count = 0;

        while (A != 0 ) {

            A = A & (A -1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Numberof1Bits soultion = new Numberof1Bits();

        System.out.println(soultion.numSetBits(11));
        System.out.println(soultion.numSetBits(6));
    }
    
}