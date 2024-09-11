package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i=0,j=0;
        while(i<g.length){
            while(j<s.length&&s[j]<g[i]){
             j++;
            }
            if(j!=s.length){
                count++;
                j++;
            }
            else{
                break;
            }
            i++;
        }
        return count;
    }
}
