public class Sudoku {
    public static boolean isSafe(int sudoku[][] , int row , int col , int digit){

        //row
        for(int j=0;j<9;j++){
            // if(j==col){
            //     continue;
            // }
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //column
        for(int i=0;i<9;i++){
            // if(i==row){
            //     continue;
            // }
            if(sudoku[i][col]==digit){
                return false;
            } 
        }
        //small block or grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                // if(i==row&&j==col){
                //     continue;
                // }
                if(sudoku[i][j]==digit){
                    return false;
                } 
            }
        }
        // sudoku[row][col]=digit;
        return true;

    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            printSudoku(sudoku);
            return true;
        }
        // else if(row==9){
        //     return false;
        // }
        //recursion
        int nextRow=row , nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        } 

        if(sudoku[row][col]!= 0){
            return sudokuSolver(sudoku ,nextRow ,nextCol);
        }

        for(int i=1;i<=9;i++){
            if(isSafe(sudoku,row,col,i)){
                sudoku[row][col] = i;
                if(sudokuSolver(sudoku ,nextRow ,nextCol)){
                    return true;
                }
            
                sudoku[row][col]=0;
            }
        }
        return false;

    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)  {
                System.out.print(sudoku[i][j]);
            }   
            System.out.println();
        }   
    }

    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution is possible");
            // printSudoku(sudoku);
        } else{
            System.out.println("solution not exist");
        }
        // 
    }
}
