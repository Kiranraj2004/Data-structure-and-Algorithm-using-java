package leetcodedailyquestion.May2024;
//3/5/2024
public class Compare_Version_Numbers {
    public static void main(String[] args) {
         String version1 = "1.1", version2 = "1.1.1";
        System.out.println(compareVersion(version1,version2));

    }
    public static  int compareVersion(String version1, String version2) {
        int i=0,j=0;
        while(i<version1.length()||j<version2.length()){
            int sum1=0;
            while(i<version1.length()&&version1.charAt(i)!='.'){
                sum1*=10;
                sum1+=(int)(version1.charAt(i))-48;
                i++;
            }
            int sum2=0;
            while(j<version2.length()&&version2.charAt(j)!='.'){
                sum2*=10;
                sum2+=(int)(version2.charAt(j))-48;
                j++;
            }
            if (sum1<sum2)return -1;
            else if(sum1>sum2)return 1;
            i++;
            j++;
        }
//        while(i<version1.length()){
//            int sum=0;
//            while(i<version1.length()&&version1.charAt(i)!='.'){
//                sum*=10;
//                sum+=(int)(version1.charAt(i))-48;
//                i++;
//            }
//            if (sum<0)return -1;
//            else if(sum>0)return 1;
//            i++;
//        }
//        while(j<version2.length()){
//            int sum=0;
//            while(j<version2.length()&&version2.charAt(j)!='.'){
//                sum*=10;
//                sum+=(int)(version2.charAt(j))-48;
//                j++;
//            }
//            if (0<sum)return -1;
//            else if(0>sum)return 1;
//            j++;
//        }
        return 0;

    }
}
