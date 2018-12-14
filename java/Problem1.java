import java.util.*;

public class Problem1{
	
	public static void main(String args[]){
		System.out.println(checkCompatible(new int[]{10,5,3,6,2}, 8));
	}

	public static boolean checkCompatible(int[] arr, int sum){
		Set<Integer> seenSet = new HashSet<>();

		for(int i=0;i<arr.length;i++){
			if(seenSet.contains(sum-arr[i])){
				return true;
			}
			else{
				seenSet.add(arr[i]);
			}
		}

		return false;
	}
}