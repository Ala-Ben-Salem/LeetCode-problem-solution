public class Main {
    public int findNonMinOrMax(int[] nums) {
        int min =nums[0];
        int max =nums[0];
        int h=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < min)
                    min=nums[j];
                if(nums[j]> max)
                    max=nums[j];
            }
        }
        for (int l=0 ;l< nums.length;l++) {
            if(nums.length==2)
                return h;
            if(nums[l]!=max && nums[l]!=min){
                h=nums[l];
                break;
            }
        }
        return h;
    }
}