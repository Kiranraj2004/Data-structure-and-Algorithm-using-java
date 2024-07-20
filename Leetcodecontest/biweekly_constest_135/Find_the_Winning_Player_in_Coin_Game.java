package Leetcodecontest.biweekly_constest_135;

public class Find_the_Winning_Player_in_Coin_Game {
    public String losingPlayer(int x, int y) {
        boolean f=false;
        while(x>=1&&y>=4){
            x--;
            y-=4;
            if(!f){
                f=true;
            }
            else{
                f=false;
            }
        }
        if(f){
            return "Alice";
        }
        return "Bob";
    }
}
