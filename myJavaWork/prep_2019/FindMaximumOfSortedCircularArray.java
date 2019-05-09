package prep_2019;

public class FindMaximumOfSortedCircularArray {

	public static void main(String args[]) {

		int[] arr = {8,9,1,5,6,7};

		System.out.println("maximum " + maximumOfCircularArray(arr));
		System.out.println("minimum " + minimumOfCircularArray(arr));
	}

	public static int minimumOfCircularArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;
		int i = 0;
		int j = nums.length - 1;
		while (i <= j) {
			if (nums[i] <= nums[j])
				return nums[i];
			int m = (i + j) / 2;
			if (nums[m] >= nums[i]) {
				i = m + 1;
			} else {
				j = m;
			}
		}
		return -1;
	}

	public static int maximumOfCircularArray(int[] nums) {

		if (nums == null || nums.length == 0)
			return -1;
		int i = 0;
		int j = nums.length - 1;
		int mid = (i + j) / 2;
		
		if (nums[i] > nums[mid])
		// maximum element lies in first half of the array
		{
			for (int k = 0; k <= mid; k++) {
				if (nums[k] > nums[mid]) {
					mid = mid - 1;
				}
				if(nums[k] >nums[k+1])
					return nums[k];
			}
			return nums[mid];
		}
		// maximum element lies in the second half of the array
		else {
			for (int l =nums.length-1;l>=mid; l--) {
				if ((nums[mid] >= nums[l])) {
					if(nums[mid] < nums[mid+1])
						mid=mid+1;
				}
				else 
					return nums[l];
			}
			return nums[mid];
		}
	}
}
