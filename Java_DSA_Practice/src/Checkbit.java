public class Checkbit {
    public int solve(int A, int B) {
        return ((A & (1 << B)) !=0) ? 1:0;
    }
    public static void main(String[] args) {
        Checkbit solution = new Checkbit();

        System.out.println(solution.solve(4, 1));
        System.out.println(solution.solve(5, 2));
    }
}