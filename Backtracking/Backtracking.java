
import java.util.*;
import java.lang.*;
import java.io.*;


public class Backtracking
{
	public static void main (String[] args)
	{
         boolean maze[][]={{true, true, true},
                {true, true, true},
                {true, true, true}};

        backtracking("",maze,0,0);
	}

    static void backtracking(String s, boolean[][] maze, int r, int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        System.out.println(s);

        if (maze[r][c]==false) {
            return;
        }

        // mark areas visited as false
        maze[r][c]=false;

        // to move up
        if(r>0)
        backtracking(s+'U',maze,r-1,c);

        // to move down
        if(r<maze.length-1)
        backtracking(s+'B',maze,r+1,c);

        // to move left
        if(c>0)
        backtracking(s+'L',maze,r,c-1);
        
        // to move right
        if(c<maze[0].length-1)
        backtracking(s+'B',maze,r,c+1);

        // restoring path i.e. backtracking
        maze[r][c]=true;

    }
}

