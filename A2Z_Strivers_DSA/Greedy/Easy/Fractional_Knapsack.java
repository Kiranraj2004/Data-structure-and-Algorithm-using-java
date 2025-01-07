package A2Z_Strivers_DSA.Greedy.Easy;
import java.util.*;
public class Fractional_Knapsack {
    public static void main(String[] args) {

    }
    static public class Pair {
        double ratio;
        int index;
        Pair(double ratio, int index) {
            this.ratio = ratio;
            this.index = index;
        }
    }

    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        ArrayList<Pair> temp = new ArrayList<>();
        for (int i = 0; i < val.size(); i++) {
            double ratio = (double) val.get(i) / (double) wt.get(i);
            temp.add(new Pair(ratio, i));
        }
        temp.sort((x, y) -> Double.compare(y.ratio, x.ratio));
        double ans = 0.0;
        int remaining = capacity;
        for (int i = 0; i < temp.size(); i++) {
            if (remaining == 0) break;
            Pair node = temp.get(i);
            int index = node.index;
            if (wt.get(index) <= remaining) {
                ans += val.get(index);
                remaining -= wt.get(index);
            } else {
                ans += node.ratio * remaining;
                remaining = 0;
            }
        }
        return Math.round(ans * 1e6) / 1e6;
    }

}
