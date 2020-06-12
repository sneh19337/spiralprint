import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            Solution.spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}
public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
    int w = 0;
      int x = matrix.length-1;
      int y = 0;
      int z = matrix[0].length-1;
      while(w <= x && y <= z){
         for (int i = w; i <= z; i++) {
            System.out.print(matrix[w][i] + " ");
         }
         for (int i = w+1; i <= x; i++) {
            System.out.print(matrix[i][z] + " ");
         }
         if(w+1 <= x){
            for (int i = z-1; i >= y; i--) {
               System.out.print(matrix[x][i] + " ");
            }
         }
         if(y+1 <= z){
            for (int i = x-1; i > w; i--) {
               System.out.print(matrix[i][y] + " ");
            }
         }
         w++;
         x--;
         y++;
         z--;
      }
   }
}
