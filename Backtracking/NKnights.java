public class NKnights {
    public static void main(String[] args)
    {
        boolean[][] board = new boolean[4][4];
        knights(board, 0, 0, 4);
    }

    static void knights(boolean[][] board, int row, int col, int n)
    {
        if (n==0)
        {
            printBoard(board);
            System.out.println();
        }

       

        if(col==board.length)
        knights(board, row+1, 0, n);

        if(isSafe(board, row, col))
        {
            board[row][col] = true;
            knights(board, row, col+1, n-1);
            board[row][col] = false;
        }

        
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function


    private static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void printBoard(boolean[][] board) {

        for(boolean[] row:board)
        {
            for(boolean val:row)
            {
                if(val)
                {
                    System.out.print("K");
                }
                else
                System.out.print("X");
            }

            System.out.println();
        }
    }
}
