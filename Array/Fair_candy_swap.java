package array;
//https://leetcode.com/problems/fair-candy-swap/
import java.util.Arrays;

public class Fair_candy_swap {
    public static void main(String[] args) {
        int []alice={2};
        int[]bob={1,3};
        System.out.println(Arrays.toString(fairCandySwap(alice,bob)));

    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicesum=0,bobsum=0;

        for (int bobSize : bobSizes) {
            bobsum += bobSize;

        }
        for (int h:aliceSizes){
            alicesum+=h;
        }
  int midnumber=(alicesum-bobsum)/2;
        for (int i = 0; i <aliceSizes.length ; i++) {
            for (int j = 0; j <bobSizes.length ; j++) {
                if (aliceSizes[i]-bobSizes[j]==midnumber){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }

            }

        }
        return null;
    }
}
