package Leetcodecontest.weekly_contest_404;

public class Maximum_Height_of_a_Triangle {
    public static void main(String[] args) {
        System.out.println(maxHeightOfTriangle(1,1));
    }
    public static int maxHeightOfTriangle(int red, int blue) {
        int max=Integer.MIN_VALUE;
        max=Math.max(max,helper(red,blue));
        max=Math.max(max,helper(blue,red));
        return max;
    }

    private  static int  helper(int red, int blue) {
        int height=0;
        boolean f=false;
        while (true){
            int n=height+1;
            if(!f){
                if (red>=n){
                    red=red-n;
                    height++;
                    f=true;
                }
                else{
                    return height;
                }
            }
            else{
                if (blue>=n){
                    blue=blue-n;
                    height++;
                    f=false;
                }
                else{
                    return height;
                }
            }
        }

    }
}
