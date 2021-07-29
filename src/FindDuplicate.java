import java.util.ArrayList;
import java.util.Scanner;


public class FindDuplicate {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col] ;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        ArrayList<Integer> aList =  new ArrayList<>();
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                aList.add(arr[i][j]);
            }
        }
        for (int k=0;k<aList.size();k++){
            for (int l=k+1;l<aList.size();l++){
                if (aList.get(k) == aList.get(l))
                    System.out.println(aList.get(k));
            }
        }

    }
}
