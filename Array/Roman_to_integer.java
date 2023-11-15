import java.util.Scanner;

public class Roman_to_integer {
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("enter the roman number :");
        String roman=input.next();
        int solution=interger(roman);
        System.out.println(solution);
    }
    public static int interger(String roman){
        int value=0,solution=0,previus=0;
        for (int i = roman.length()-1; i >=0; i--) {
            switch (roman.charAt(i)) {
                case 'I' -> value = 1;
                case 'V' -> value = 5;
                case 'X' -> value = 10;
                case 'L' -> value = 50;
                case 'C' -> value = 100;
                case 'D' -> value = 500;
                case 'M' -> value = 1000;
          }
            if (previus>value){
            solution-=value;
            }else {
                solution+=value;
            }
            previus=value;
        }
return solution;
    }
}
