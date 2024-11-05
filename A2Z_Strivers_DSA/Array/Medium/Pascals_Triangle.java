package A2Z_Strivers_DSA.Array.Medium;
//https://leetcode.com/problems/pascals-triangle/description/
import java.util.*;
public class Pascals_Triangle {
    public static void main(String[] args) {

    }

//     if the given question is  given row and column find the pascal number in that index
//     optimal soulution is ncr
     public int ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
     }
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
}
