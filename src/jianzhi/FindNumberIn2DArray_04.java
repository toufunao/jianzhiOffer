package jianzhi; /**
 *在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 从右上角开始遍历寻找，类似二叉搜索
 */
public class FindNumberIn2DArray_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0)
            return false;
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if (target==matrix[row][col])
                return true;
            else if (target>matrix[row][col])
                row++;
            else if (target<matrix[row][col])
                col--;
        }
        return false;
    }
}
