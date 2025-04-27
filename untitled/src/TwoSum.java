import java.util.TreeMap;

public class TwoSum {
//    public int[] twoSum(int[] nums, int target) {
//        int current_pos = 0;
//        int current = nums[0];
//        int[] results = new int[2];
//        for (int i = current_pos + 1; i < nums.length; i++){
//            if (nums[current_pos] + nums[i] == target){
//                results[0] = current_pos;
//                results[1] = i;
//                break;
//            }
//            current_pos++;
//            current = nums[current_pos];
//        }
//        return results;
//    }

    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (map.containsKey(nums[i])){
                map.get
            }
            map.put(nums[i], i);
        }
        int[] results = new int[2];
        for (int j = 0; j < nums.length ; j++){
            int toFind = target - nums[j];
            if (map.containsKey(toFind)){
                results[0] = map.get(toFind);
                results[1] = j;
                break;
            };
        }
        return results;
    }
}
