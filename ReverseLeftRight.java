import java.util.Scanner;
class ReverseLeftRight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
         for (int i = 1; i <= n; i++) {
         int mid = n / 2;
        // Print the first half in reverse order
        if (i <= mid) {
            System.out.print((mid - i + 1) + " ");
        } 
        // Print the second half in reverse order
        else {
            System.out.print((n - (i - mid) + 1) + " ");
        }
    }
    System.out.println();

    }
}