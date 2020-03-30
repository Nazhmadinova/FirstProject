package IntervewTasks;

import java.util.Arrays;

public class FloodFill {

    //Given a 2D screen, location of a pixel in the screen and
    // a color, replace color of the given pixel and all adjacent same colored pixels with the given color.
    //Input:
    //       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
    //                      {1, 1, 1, 1, 1, 1, 0, 0},
    //                      {1, 0, 0, 1, 1, 0, 1, 1},
    //                      {1, 2, 2, 2, 2, 0, 1, 0},
    //                      {1, 1, 1, 2, 2, 0, 1, 0},
    //                      {1, 1, 1, 2, 2, 2, 2, 0},
    //                      {1, 1, 1, 1, 1, 2, 1, 1},
    //                      {1, 1, 1, 1, 1, 2, 2, 1},
    //                      };
    //    x = 4, y = 4, newColor = 3
    //The values in the given 2D screen indicate colors of the pixels.
    //x and y are coordinates of the brush, newColor is the color that
    //should replace the previous color on screen[x][y] and all surrounding
    //pixels with same color.
    //
    //Output:
    //Screen should be changed to following.
    //       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
    //                      {1, 1, 1, 1, 1, 1, 0, 0},
    //                      {1, 0, 0, 1, 1, 0, 1, 1},
    //                      {1, 3, 3, 3, 3, 0, 1, 0},
    //                      {1, 1, 1, 3, 3, 0, 1, 0},
    //                      {1, 1, 1, 3, 3, 3, 3, 0},
    //                      {1, 1, 1, 1, 1, 3, 1, 1},
    //                      {1, 1, 1, 1, 1, 3, 3, 1},
    //                      };



    // A recursive function to replace previous color 'prevC' at '(x, y)'
// and all surrounding pixels of (x, y) with new color 'newC' and
    static void floodFillUtil(int screen[][],int innerArrSize, int x, int y,
                              int prevC, int newC)
    {
        // Base cases
        if (x < 0 || x >= screen.length || y < 0 || y >= innerArrSize)
            return;
        if (screen[x][y] != prevC)
            return;

        // Replace the color at (x, y)
        screen[x][y] = newC;

        // Recur for north, east, south and west
        floodFillUtil(screen, innerArrSize,x+1, y, prevC, newC);
        floodFillUtil(screen,innerArrSize, x-1, y, prevC, newC);
        floodFillUtil(screen,innerArrSize, x, y+1, prevC, newC);
        floodFillUtil(screen,innerArrSize, x, y-1, prevC, newC);
    }
    // It mainly finds the previous color on (x, y) and calls floodFillUtil()
    static void floodFill(int screen[][],int innerArrSize, int x, int y, int newC)
    {
        int prevC = screen[x][y];
        floodFillUtil(screen,innerArrSize, x, y, prevC, newC);
    }

    // Driver code
    public static void main(String[] args)
    {
        int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 2, 1, 2, 2, 1},
        };
        int x = 4, y = 4, newC = 3;
        floodFill(screen,8, x, y, newC);

        System.out.println("Updated screen after call to floodFill: ");
        for (int i = 0; i < screen.length; i++)
        {
            for (int j = 0; j < 8; j++)
                System.out.print(screen[i][j] + " ");
            System.out.println();
        }
        System.out.println(Arrays.deepToString(screen));
    }

}
