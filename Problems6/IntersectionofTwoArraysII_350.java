package Leetcode;

import java.util.Arrays;

public class IntersectionofTwoArraysII_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int nums3 = 0;
        for(int i =0; i<=len1; i++){
            for(int j = 0; true; j++){
                if (nums1[i]==nums2[j])
                    nums3= nums1[i];
                break;
            }
        }
        return new int[]{nums3};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{2, 2}, new int[]{2, 2, 4, 5})));

    }
}
