import java.util.HashMap;
public class TwoSum{
    public static int[] twoSum(int[] nums,int target){
        int complement;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            complement= target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        int[] arr = twoSum(new int[]{3,2,4}, 6);
        if (arr[0] != -1) {
            System.out.println("Indices: " + arr[0] + " and " + arr[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}