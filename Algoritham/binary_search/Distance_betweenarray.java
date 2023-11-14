//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
public class Distance_betweenarray {
    public static void main(String[] args) {
        int[]arr1= {1,4,2,3};
        int[]arr2={-4,-3,6,10,20,30};
        System.out.println(findthedistancevalue(arr1,arr2,3));


    }
    public static int findthedistancevalue(int[]arr1,int[]arr2,int distance){
       int d=0;

        for (int i = 0; i < arr1.length; i++) {
            boolean answer=false;
             for (int j = 0; j <arr2.length ; j++) {
                int modula=arr1[i]-arr2[j];
                if (modula<0){
                    modula*=-1;
                }
               if (modula<=distance){
                   answer=true;
               }
            }

            if (!answer) d++;

        }
        return d;
    }
}
