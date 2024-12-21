import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    static class Item {
        int value, weight;
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    static class ItemComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1);
        }
    }

    public int solve(int[] A, int[] B, int C) {
        int n = A.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(A[i], B[i]);
        }
        Arrays.sort(items, new ItemComparator());
        double maxValue = 0.0;
        int currentWeight = 0;
        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i].weight <= C) {
                currentWeight += items[i].weight;
                maxValue += items[i].value;
            } else {
                int remainingWeight = C - currentWeight;
                maxValue += ((double) items[i].value / items[i].weight) * remainingWeight;
                break;
            }
        }
        return (int) Math.floor(maxValue * 100 + 1e-9);
    }

    public static void main(String[] args) {
        FractionalKnapsack solution = new FractionalKnapsack();

        int[] A1 = {3};
        int[] B1 = {20};
        int C1 = 17;
        System.out.println("Output 1: " + solution.solve(A1, B1, C1));
        int[] A2 = {60, 100, 120};
        int[] B2 = {10, 20, 30};
        int C2 = 50;
        System.out.println("Output 2: " + solution.solve(A2, B2, C2));
        int[] A3 = {10, 20, 30, 40};
        int[] B3 = {12, 13, 15, 19};
        int C3 = 10;
        System.out.println("Output 3: " + solution.solve(A3, B3, C3));
    }
}