class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i:nums1) set1.add(i);
        for(int j:nums2) set2.add(j);

        int count1=0, count2=0;

        for(int i : nums1){
            if (set2.contains(i)) count1++;
        }

        for(int j : nums2){
            if (set1.contains(j)) count2++;
        }

        return new int[]{count1, count2};

        
    }
}