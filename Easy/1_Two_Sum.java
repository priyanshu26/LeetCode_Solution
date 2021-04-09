// -------------First Way using hashMap-------------------------


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        
        // fill HM
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        // Searching
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index==i)continue;
                return new int[]{i,index};
            } 
        }
        return new int[]{};
    }
}





// --------------------Another Way. -----------------------------




class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                   // break;
                }
            }
        }
         return res;
    }
   
}
