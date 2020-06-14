package array;

public class KadeneAlgorithmLongestSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int n = arr.length;
		
		int max_so_far =0;
		int max_ends_here =0;
		
		for(int i=0;i<n;i++)
		{
			max_ends_here = max_ends_here+ arr[i];
			if( max_ends_here <0)
				max_ends_here =0;
			if(max_so_far < max_ends_here)
				max_so_far = max_ends_here;
		}
		
		System.out.println(max_so_far);

	}

}
