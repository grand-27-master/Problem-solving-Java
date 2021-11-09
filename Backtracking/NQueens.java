public class NQueens {
    public static void main(String... args)
    {
        boolean[][] board = new boolean[3][3];

        System.out.println(queens(board, 0));

    }

    static int queens(boolean[][] board, int row)
    {
        if(row==board.length)
        {
            display(board);
            return 1;
        }

        int count=0;
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        for(int i=0;i<row;i++)
        {
            if(board[i][col]==true)
            return false;
        }
        return false;
    }

    private static void display(boolean[][] board) {

        for(boolean[] row: board)
        {
            for(boolean col: row)
            {
                System.out.print(col ? "Q" : "X");
            }
            System.out.println();
        }

    }
}
