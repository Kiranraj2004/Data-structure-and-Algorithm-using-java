package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int maxProduct = 0;


            for (int incA = 0; incA <= 5; incA++) {
                for (int incB = 0; incB <= 5 - incA; incB++) {

                    int incC = 5 - incA - incB;
                    int newA = a + incA;
                    int newB = b + incB;
                    int newC = c + incC;

                    int product = newA * newB * newC;
                    if (product > maxProduct) {
                        maxProduct = product;
                    }
                }
            }
            System.out.println(maxProduct);
        }
    }
}


