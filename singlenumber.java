public class singlenumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0; //initializing 0
        for (int i = 0; i < nums.length; i++) { //looping
            result = result ^ nums[i]; 
        }
        return result; 
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int single1 = findSingleNumber(nums1);
        System.out.println("Single number in nums1: " + single1); // Output: 1
        int[] nums2 = {4, 1, 2, 1, 2};
        int single2 = findSingleNumber(nums2);
        System.out.println("Single number in nums2: " + single2); // Output: 4
        int[] nums3 = {1};
        int single3 = findSingleNumber(nums3);
        System.out.println("Single number in nums3: " + single3); // Output: 1
    }
}
