package leetcodedailyquestion.september;
import java.util.*;
public class spiral_matrix {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int count=0;
        int srow=0;
        int scol=0;
        int erow=matrix.length-1;
        int ecol=matrix[0].length-1;
        int total=matrix[0].length*matrix.length;
        while(count<total){
            // colrightmove
            for(int i=scol;i<=ecol&&count<total;i++){
                res.add(matrix[srow][i]);
                count++;
            }
            // row down move
            for(int i=srow+1;i<=erow&&count<total;i++){
                res.add(matrix[i][ecol]);
                count++;
            }
            // col leftmove
            for(int i=ecol-1;i>=scol&&count<total;i--){
                res.add(matrix[erow][i]);
                count++;
            }
            //  row up move
            for(int i=erow-1;i>=srow+1&&count<total;i--){
                res.add(matrix[i][scol]);
                count++;
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return res;
    }
}
