public class Main {
    public String triangleType(int[] nums) {
        String x="none";
        if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[2]+nums[0]>nums[1])
        {
            if(nums[0]==nums[1] && nums[1]==nums[2])
            {x= "equilateral";}
            else if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2])
            { x="isosceles";}
            else
                x="scalene";
        }

        return x;
    }
}