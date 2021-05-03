package jianzhi;

public class SpiralOrder_29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0)
            return new int[]{};

        int row = matrix.length;
        int col = matrix[0].length;
        int n = row * col;
        int count = 0;
        int[] res=new int[n];
        int left=0,right=col-1,up=0,down=row-1;
        while (count < n) {

            for (int i=left;i<=right;i++){
                res[count]=matrix[up][i];
                count++;
            }
            up+=1;
            if (up>down)
                break;

            for (int i=up;i<=down;i++){
                res[count]=matrix[i][right];
                count++;
            }
            right-=1;
            if (left>right)
                break;

            for (int i=right;i>=left;i--){
                res[count]=matrix[down][i];
                count++;
            }
            down-=1;
            if (up>down)
                break;

            for (int i=down;i>=up;i--){
                res[count]=matrix[i][left];
                count++;
            }
            left+=1;
            if (left>right)
                break;

        }
        return res;
    }
}
