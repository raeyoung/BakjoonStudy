import java.util.Scanner;
 
public class Bak10950 {
 
	public static void main(String[] args) {
		     
		Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int arr[] = new int[c];
        
        for(int i=0 ; i<c ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }
        sc.close();

        for (int k : arr) {
            System.out.println(k);
        }
	}
 
}