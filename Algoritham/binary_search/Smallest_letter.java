//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_letter {
    public static void main(String[] args) {
        char[]letters={'c','f','g','j'};
       char target='d';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[]letters,char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(letters[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[(start)%letters.length];

    }
}
