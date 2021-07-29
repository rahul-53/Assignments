import java.util.Scanner;

public class SumOfAlternateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr= new int[n];
        int sumAtEven=0;
        for (int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        for (int i=0;i<n;i++){
            if (i%2==0){
                sumAtEven+=arr[i];
            }
        }
        System.out.println(sumAtEven);
    }
}
