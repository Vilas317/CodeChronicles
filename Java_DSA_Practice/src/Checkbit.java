public class Checkbit {
    public static void main(String[] args) {
        Checkbit solution = new Checkbit();

        System.out.println(solution.solve(4, 1));
        System.out.println(solution.solve(5, 2));
    }
    public int solve(int A, int B) {
        int num = 1 << B;
        if((A & num) == 0){
            return 0;
        }
        return 1;
    }
}