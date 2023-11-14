package String;

public class Can_Place_Flowers {
    public static void main(String[] args) {
        int []flowerbed={1,0,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,2));
    }
    public  static boolean canPlaceFlowers(int[] flowerbed, int n) {
       int a=0;
        if(flowerbed[0]==0&&flowerbed[1]==0){
            a++;
        }
        if (flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0)a++;
        for (int i = 1; i < flowerbed.length-1; i++) {
            if (flowerbed[i]==0&&flowerbed[i+1]==0&&flowerbed[i-1]==0){
                flowerbed[i]=1;
                a++;
            }
        }
        return a==n;
    }
}
