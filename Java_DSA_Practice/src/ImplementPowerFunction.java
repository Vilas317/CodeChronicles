public class ImplementPowerFunction {
    public int pow(int A, int B, int C) {
        if(A == 0)
        return 0;
        if(B == 0)
        return 1;
        long ans = pow(A, B/2, C);
        ans = (ans * ans) % C;
        if(B % 2 == 1)
        ans = (ans + C) % C;
        return (int) ans;
    }
    
}
