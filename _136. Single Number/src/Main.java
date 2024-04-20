public class Main {
    public int singleNumber(int[] nums) {
        int res=0;
        if(nums.length==1)
            res=nums[0];
        else
            for(int i=0;i<nums.length;i++)
                res=res^nums[i];                   //xor
        return res;
    }
}