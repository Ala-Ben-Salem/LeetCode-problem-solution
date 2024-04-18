public class Main {
    public int[] leftRightDifference(int[] nums) {
        int[] answer=new int[nums.length];
        if (nums.length==1)
            answer[0]=0;
        else{
            int[] leftSum=new int[nums.length];
            int[] rightSum=new int[nums.length];

            leftSum[0]=0;
            leftSum[1]=nums[0];
            for(int i=2;i<nums.length;i++){
                leftSum[i]=(int)(leftSum[i-1]+nums[i-1]);
            }

            rightSum[nums.length-1]=0;
            rightSum[nums.length-2]=nums[nums.length-1];
            for(int i=nums.length-3;i>=0;i--)
                rightSum[i]=(int)(rightSum[i+1]+nums[i+1]);

            for(int i=0;i<nums.length;i++)
            {
                answer[i] = Math.abs( leftSum[i] - rightSum[i]);
            }
        }
        return answer;
    }
}