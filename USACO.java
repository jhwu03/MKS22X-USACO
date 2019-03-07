public class USACO{
  public static int bronze(String filename){
    int R , C , E , N ;
    File text = new File(filename);
    Scanner s = new Scanner(text);
    try{
    R = s.nextInt();
    C = s.nextInt();
    E = s.nextInt();
    N = s.NextInt();
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
  }catch(Exceptions e){
    e.printStackTrace();
  }

  }
}
