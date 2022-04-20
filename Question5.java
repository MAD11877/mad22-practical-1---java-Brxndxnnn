import java.io.*;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
			
		int n = in.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		int maxVal=0, count=0, maxCount=0;
		
		for(int i=0;i<n;i++) {
			count = 0;
			for(int j=0;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
	                    maxCount = count;
	                    maxVal = arr[i];
	               }
		}
		System.out.print(maxVal);
	}
}
