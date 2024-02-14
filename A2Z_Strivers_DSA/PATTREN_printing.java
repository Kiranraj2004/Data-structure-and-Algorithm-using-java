package A2Z_Strivers_DSA;
//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PATTREN_printing {
    public static void main(String[] args) {
        int n = 3; // Size of the diamond
     symmetryq21(3);
        getNumberPattern(4);

        // Upper half of the diamond
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                if (j == 0 || j == 2 * i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // Lower half of the diamond
//        for (int i = n - 2; i >= 0; i--) {
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                if (j == 0 || j == 2 * i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
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


    public static void symmetryq19(int n) {
        // Write your code here
        int start=n;
        int spaces=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <start ; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <spaces ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <start ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            start--;
            spaces+=2;
        }
        start=1;
        spaces-=2;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <start ; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <spaces ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <start ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            start++;
            spaces-=2;
        }
    }
    public static void symmetryq20(int n) {
        // Write your code here
        int start=1;
        int spaces=(n-1)*2;
        for (int i = 1; i <=n*2-1 ; i++) {
            if (i>n){
                spaces+=2;
                start--;
            }else if (i!=1){
                spaces-=2;
                start++;
            }
            for (int j = 0; j <start ; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <spaces ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <start ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void symmetryq21(int n) {
        // Write your code here
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else if (j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//                    ***
//                    * *
//                    ***
    }

    public static void getNumberPattern(int n) {
        // Write your code here.
        for (int row = 0; row <n*2-1 ; row++) {
            for (int col = 0; col <n*2-1 ; col++) {
                int min=Math.min(Math.min(col,n*2-col-2),Math.min(row,n*2-row-2));
                System.out.print(n-min);
            }
            System.out.println();
        }
//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444

    }
}
