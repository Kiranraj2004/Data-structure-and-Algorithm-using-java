package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;

import java.util.LinkedList;
import java.util.Queue;

public class Flood_Fill {
    public static void main(String[] args) {

    }
//    using bfs
//    which take tc O(M*N)
//    SC O(M*N)
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc]==color){
            return image;
        }
        Queue<int[]>temp=new LinkedList<>();
        temp.add(new int[]{sr,sc});
        int start=image[sr][sc];
        while(!temp.isEmpty()){
            int[]index=temp.remove();
            int r=index[0];
            int c=index[1];
            image[r][c]=color;
            if (r-1>=0&&image[r-1][c]==start){
                temp.add(new int[]{r-1,c});

            }
            if (r+1<image.length&&image[r+1][c]==1){
                temp.add(new int[]{r+1,c});
            }
            if (c-1>=0&&image[r][c-1]==1){
                temp.add(new int[]{r,c-1});
            }
            if (c+1<image[0].length&&image[r][c+1]==1){
                temp.add(new int[]{r,c+1});
            }
        }
        return image;
    }
//    int adjR[] = new int[]{0, 0, -1, 1};
//    int adjC[] = new int[]{-1, 1, 0, 0};
//    using dfs

//    public void dfs(int sr, int sc, int[][] image, int[][] answer, int startColor, int newColor){
//        int n = image.length;
//        int m = image[0].length;
//
//        answer[sr][sc] = newColor;
//
//        for(int i = 0; i < 4; i++){
//            int xx = sr + adjR[i];
//            int yy = sc + adjC[i];
//            if(xx >= 0 && xx < n && yy >= 0 && yy < m && image[xx][yy] == startColor && answer[xx][yy] != newColor){
//                dfs(xx, yy, image, answer, startColor, newColor);
//            }
//        }
//    }
//    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//        int[][] answer = image;
//        int startColor = image[sr][sc];
//        dfs(sr, sc, image, answer, startColor, color);
//        return answer;
//    }

    }
