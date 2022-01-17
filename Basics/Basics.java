import java.util.*;
import java.util.ArrayList;
public class Basics {
	public static void main(String[] args) {
		int[] numbers = {7, 27, 226622, 98, 76578};
		LoopArr(numbers);
		MaxMinAve(numbers);

		System.out.println(GetArraySum(numbers));
		
		
	}
	public static void PrintAll() {

		for(int i = 0; i < 256; i++)

			System.out.println(i);
	}
	public static void OddNum() {
		for(int i = 0; i < 256; i++) {

			if(i % 2 == 0)

				System.out.println(i);
		}
	}
	public static void SumAll() { 
		int sum = 0;

		for(int i = 0; i < 256; i++) {
			sum += 0;

			System.out.println(String.format("Number: %d, Sum: %d", i, sum));
		}
	}

	public static int GetArraySum(int[] numbers) {
		int sum = 0;

		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];			
		}
		return sum;
	}

	public static void LoopArr(int[] arr) {
		for(int val: arr)
			System.out.println(val);
	}

	public static int FMaximum(int[] arr) {
		int maxCount = Integer.MIN_VALUE;
		for(int val: arr){
			if(val > maxCount)
	
			maxCount = val;
		}
		return maxCount;
	
	}
	
	public static int FMinimum(int[] arr) {
		int minCount = Integer.MAX_VALUE;
		for(int val: arr){
			if(val < minCount)
	
			minCount = val;
		}
	
		return minCount;
	}
	public static double AveCalc(int[] numbers) {
	
		int sum = GetArraySum(numbers);
		double avg =(double)sum/numbers.length;
	
		System.out.println(String.format("Sum: %d, Average: %f", sum, avg));
		return avg;
	}




	public static ArrayList<Integer> OArrOdd() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	
		for(int i = 0; i <= 255; i++) {
	
			if(i % 2 != 0)
				numbers.add(i);
	
			}
	
			return numbers;
	}
	public static int MoreNum(int[] arr, int y) {
		int count = 0;
	
	
		for(int num: arr) {
	
			if(num > y)
				count++;
		}
		return count;
	}
	public static void ArrSqua(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {

			numbers[i] = numbers[i] * numbers[i];	
		}

	}

	public static void NegDel(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
	
			if(numbers[i] < 0)
	
			numbers[i] = 0;
		}
	}
	public static void MaxMinAve(int[] numbers) {

		int min = FMinimum(numbers);
		int max = FMaximum(numbers);
		
		
		double avg = AveCalc(numbers);
		
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
	}

	
}