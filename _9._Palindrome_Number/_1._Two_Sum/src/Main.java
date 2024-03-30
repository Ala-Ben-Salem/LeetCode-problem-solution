public class Main {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int j;
        for(int i=0;i< nums.length;i++)
        {
            j=i+1;
            while(j<nums.length)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                }
                j++;
            }
        }
        return res;
    }

}