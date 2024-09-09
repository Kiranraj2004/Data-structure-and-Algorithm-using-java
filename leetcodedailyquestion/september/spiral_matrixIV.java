package leetcodedailyquestion.september;

public class spiral_matrixIV {
    public static void main(String[] args) {

    }
//    public int[][] spiralMatrix(int m, int n, ListNode head) {
//        int [][]res=new int [m][n];
//        int count=0;
//        int srow=0;
//        int scol=0;
//        int erow=m-1;
//        int ecol=n-1;
//        int total=m*n;
//        ListNode curr=head;
//        while(count<total){
//            // colrightmove
//            for(int i=scol;i<=ecol&&count<total;i++){
//                if(curr!=null){
//                    res[srow][i]=curr.val;
//                    curr=curr.next;
//                }
//                else{
//                    res[srow][i]=-1;
//                }
//                count++;
//            }
//            // row down move
//            for(int i=srow+1;i<=erow&&count<total;i++){
//                if(curr!=null){
//                    res[i][ecol]=curr.val;
//                    curr=curr.next;
//                }
//                else{
//                    res[i][ecol]=-1;
//                }
//                count++;
//            }
//            // col leftmove
//            for(int i=ecol-1;i>=scol&&count<total;i--){
//                if(curr!=null){
//                    res[erow][i]=curr.val;
//                    curr=curr.next;
//                }
//                else{
//                    res[erow][i]=-1;
//                }
//                count++;
//            }
//            //  row up move
//            for(int i=erow-1;i>=srow+1&&count<total;i--){
//                if(curr!=null){
//                    res[i][scol]=curr.val;
//                    curr=curr.next;
//                }
//                else{
//                    res[i][scol]=-1;
//                }
//                count++;
//            }
//            srow++;
//            scol++;
//            erow--;
//            ecol--;
//        }
//        return res;

}
