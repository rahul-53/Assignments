import java.util.Scanner;

public class MatrixReversal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][]arr= new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for(int i=row-1;i>=0;i--){
            for (int j=col-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
