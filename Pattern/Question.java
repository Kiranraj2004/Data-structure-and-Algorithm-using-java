package Pattern;

public class Question {
    public static void main(String[] args) {
        //question2(5);
        question5(3);
    }
    static void question2(int n){
    //*
    //* *
    //* * *
    //* * * *
    //* * * * *

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void question3(int n)
    {
        for (int row = 1; row <2*n; row++) {
            int i = row > n ?  2*n-row: row;
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /* answer when n is 5
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
    }

    static  void  question4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        /*answer
              *
             **
            ***
           ****
          *****
         */
    }

    static void question5(int n){
        for (int rows = 1; rows <=2*n ; rows++) {
            int i=rows>n?2*n-rows:rows-1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n-i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*answer
         * * * * *
          * * * *
           * * *
            * *
             *
             *
            * *
           * * *
          * * * *
         * * * * *

         */
    }

    
}

