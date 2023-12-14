package com.ianirudhkhabya.Recursion;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countWays(4, 3));
//        showPaths("", 3, 3);
        boolean[][] maze = {
                {true, true, true, true},
                {true, false, true, true},
                {true, true, false, true},
                {true, true, true, true},
        };
        pathRestrictions("", maze, 0, 0);
    }

    static int countWays(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int down = countWays(r-1, c);
        int right = countWays(r, c-1);
        return down + right;
    }

    static void showPaths(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r > 1){
            showPaths(p+'D', r-1, c);
        }

        if (c > 1){
            showPaths(p+'R', r, c-1);
        }
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r < maze.length - 1){
            pathRestrictions(p+'D', maze, r+1,c);
        }

        if (c < maze.length - 1){
            pathRestrictions(p+'R', maze, r, c+1);
        }
    }
}
