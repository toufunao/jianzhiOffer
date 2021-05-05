package jindian;

import java.util.ArrayList;
import java.util.List;

public class SetZeroes_0108 {
    public void setZeroes(int[][] matrix) {
        List<Integer> rowCount=new ArrayList<>();

        List<Integer> colCount=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]==0){
                    rowCount.add(i);
                    colCount.add(j);
                }
            }
        }
        for (Integer i:rowCount){
            for (int j=0;j<col;j++){
                matrix[i][j]=0;
            }
        }

        for (Integer i:colCount){
            for (int j=0;j<row;j++){
                matrix[j][i]=0;
            }
        }

    }
}
