import java.util.*;
import java.io.*;
public class USACO{
  public static int bronze(String filename)throws FileNotFoundException{
    int R , C , E , N ;
    int ans = 0;
    File text = new File(filename);
    Scanner s = new Scanner(text);
    R = s.nextInt();
    C = s.nextInt();
    E = s.nextInt();
    N = s.nextInt();
    int[][] field = new int[R][C];
    for(int i = 0; i < R;i++){
      for(int j = 0; j < C;j++){
        field[i][j] = s.nextInt();
      }
    }
    int[][] digging = new int[N][3];
    for(int i = 0; i < N;i++){
      for(int j = 0; j < 3; j++){
        digging[i][j] = s.nextInt();
      }
    }
    for(int i = 0; i< N;i++){
      bronzeH(field,digging[i][0] - 1,digging[i][1] - 1,digging[i][2]);
    }

    for(int i = 0; i < R;i++){
      for(int j = 0; j < C;j++){
        if(field[i][j] < E){
          ans = ans + (E - field[i][j]);
        }
      }
    }
    return 72 * 72 * ans;
  }
  public static int[][] bronzeH(int[][] field, int row, int col, int level) {
  int biggest = 0;
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j ++) {
      if (field[row + i][col + j] > biggest) {
        biggest = field[row + i][col + j];
      }
    }
  }
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j ++) {
      if (biggest - field[row + i][col + j] <= level) {
        field[row + i][col + j] = biggest - level;
      }
    }
  }
  return field;
}

public static int silver(String filename) throws FileNotFoundException {
  int N , M , T;
  int ans = 0;
  File text = new File(filename);
  Scanner s = new Scanner(text);
  N = s.nextInt();
  M = s.nextInt();
  T = s.nextInt();
  int[][] field = new int[N][M];
  String R = "";
  for(int i = 0; i < N;i++){
    R = s.next();
    for(int j = 0; j < M;j++){
      if(R.charAt(j) == '*'){
        field[i][j] = -1;
      }
      if(R.charAt(j) == '.'){
        field[i][j] = 0;
      }
    }
  }
  int startX = s.nextInt();
  int startY = s.nextInt();
  int endX = s.nextInt();
  int endY = s.nextInt();
  field[startX - 1][startY - 1] = 1;
  for(int k = 0; k < T; k++) {
  field = silverH(field);
  }
  return field[endX - 1][endY - 1];
}


}
