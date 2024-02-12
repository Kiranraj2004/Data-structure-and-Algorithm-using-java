package A2Z_Strivers_DSA;

public class PATTREN_printing {
    public static void main(String[] args) {
        int n = 3; // Size of the diamond

        // Upper half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void nStarTriangle(int n) {

        // Write your code here
        for (int i =1 ; i <=(n*2-1); i++) {
            int s=i>n?2*n-i:i;

            for (int j = 0; j <s; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*    *
      **
      ***
      **
      *
 */

    public static void nStarDiamond(int n) {
        // Write your code here
        for (int index = 1; index <= n*2; index++) {
            int s=index>n?index-n-1:n-index;
            for (int i = 0; i <s ; i++) {
                System.out.print(" ");
            }
            int f=index>n?n-(index-n-1):index;
            for (int j = 0; j <f+(f-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//      *
//     ***
//    *****
//    *****
//     ***
//      *

}
