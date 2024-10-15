public class MaximumSubArray {
    public static int findMaxSubArray(int[] nums){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int temp=nums[i]+currentSum;
            if(temp<nums[i]) currentSum=nums[i];
            else currentSum=temp;
            if(currentSum>maxSum) maxSum=currentSum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubArray(arr));
    }
}
