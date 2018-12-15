import java.util.*;

public class Problem2{
	
	public static void main(String args[]){
		System.out.println(Arrays.toString(solution(new int[]{1})));
	}

	public static int[] solution(int[] arr){
		if(arr.length<2){
			return arr;
		}

		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		int ans[] = new int[arr.length];

		left[0] = arr[0];
		for(int i=1;i<arr.length;i++){
			left[i] = left[i-1]*arr[i];
		}

		right[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			right[i] = right[i+1] * arr[i];
		}

		ans[0] = right[1];
		ans[arr.length-1] = left[arr.length-2];
		for(int i=1;i<arr.length-1;i++){
			ans[i] = left[i-1] * right[i+1];
		}

		return ans;


	}
}