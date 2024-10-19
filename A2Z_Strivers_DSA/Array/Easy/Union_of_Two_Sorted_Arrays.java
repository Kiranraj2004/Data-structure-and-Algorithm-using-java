package A2Z_Strivers_DSA.Array.Easy;
import java.util.*;
public class Union_of_Two_Sorted_Arrays {
    public static void main(String[] args) {

    }
//     brute force method
    public static ArrayList<Integer> findUnion1(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet <Integer> s=new HashSet<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        ArrayList<Integer> Union = new ArrayList<>(s);
        Collections.sort(Union);
        return Union;
    }

//    tc O(nlogn) sorting take  sc O(n+m)

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        // Traverse both arrays using two pointers
        while (i < n && j < m) {
            // If arr1[i] is smaller, add it to ans
            if (arr1[i] < arr2[j]) {
                // Avoid adding duplicates
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            }
            // If arr2[j] is smaller, add it to ans
            else if (arr2[j] < arr1[i]) {
                // Avoid adding duplicates
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }
            // If both elements are equal, add any one and move both pointers
            else {
                // Avoid adding duplicates
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < n) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < m) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }

        return ans;
    }
//    tc(n+m) sc O(1); dont consider the output array
}
