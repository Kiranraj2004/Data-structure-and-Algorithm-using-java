package A2Z_Strivers_DSA.Array.Medium;
//https://leetcode.com/problems/pascals-triangle/description/
import java.util.*;
public class Pascals_Triangle {
    public static void main(String[] args) {

    }

//     if the given question is  given row and column find the pascal number in that index
//     optimal solution is ncr
//    0 based index for row and col
     public int ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
     }

//     https://leetcode.com/problems/pascals-triangle/description/

//     printing  the entire pascal triangle up to Nth row

//     using dp method
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        for(int row=1;row<numRows;row++){
            int i=-1;
            int j=0;
            int k=0;
            temp=new ArrayList<>();
            while(k<=row){
                if(i==-1||j==row){
                    temp.add(1);
                }
                else{
                    int sum=ans.get(row-1).get(i)+ans.get(row-1).get(j);
                    temp.add(sum);
                }
                i++;
                j++;
                k++;
            }
            ans.add(temp);
        }
        return ans;
    }
//    TC O(n**2)
//    sc O(1) we are using the space to store answer

    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            List<Integer>temp=new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                temp.add(ncr(i,j));
            }
            ans.add(temp);

        }
        return ans;
    }
    //    TC O(n*n*r)==O(n**3)
//    sc O(1) we are using the space to store answer

//    optimal solution formula method
    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for (int i = 1; i <numRows ; i++) {
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            long a=1;
            for (int j = 1; j <=i ; j++) {
                a=a*(i-j);
                a=a/j;
                temp.add((int)a);
            }
            ans.add(temp);
        }
        return ans;
    }
    //    TC O(n*n)==O(n*n)
//    sc O(1) we are using the space to store answer
//    https://leetcode.com/problems/pascals-triangle/description/
}
