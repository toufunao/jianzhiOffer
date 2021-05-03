package jianzhi;

public class PathInMatrix_12 {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        char[] words=word.toCharArray();

        int[][] visited=new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board,words,visited,i,j,0))
                    return true;
            }
        }
        return false;

    }

    private boolean dfs(char[][] board, char[] words, int[][] visited, int i, int j, int index) {
        if (i>=board.length || i<0||j>=board[0].length||j<0|| board[i][j]!=words[index]||visited[i][j]==1)
            return false;
        if (index==words.length-1)
            return true;

        visited[i][j]=1;
        boolean ans=dfs(board,words,visited,i+1,j,index+1) || dfs(board,words,visited,i-1,j,index+1)||
                dfs(board,words,visited,i,j+1,index+1) || dfs(board,words,visited,i,j-1,index+1);

        visited[i][j]=0;

        return ans;
    }
}
