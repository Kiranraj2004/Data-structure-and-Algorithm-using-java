package leetcodedailyquestion.september;

public class K_th_Smallest_in_Lexicographical_Order {
    public static void main(String[] args) {
        K_th_Smallest_in_Lexicographical_Order obj =new K_th_Smallest_in_Lexicographical_Order();
        System.out.println(obj.findKthNumber(1,1));

    }
    static int  count=0;
    public int findKthNumber(int n, int k) {
        for(int i=1;i<=9;i++){
            int num= helper(i,n,k);
            if(num>0) return num;
        }
        return 0;
    }
    public int helper(int num,int target,int k ){
        if(num>target){
            return 0;
        }
        count++;
        if(count==k)return num;
        num*=10;
        for(int i=0;i<=9;i++){
            int n=helper(num+i,target,k);
            if(n==0){
                break;
            }
            else if(n!=-1){
                return n;
            }
        }
        return -1;
    }
}
