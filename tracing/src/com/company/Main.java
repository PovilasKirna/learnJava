package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {12,5,13,7,8,15};
        for(int a = 0; a < 6; a = a+1) {
            for(int b = 0; b < 6; b = b+1) {
                if( nums[a]+nums[b] == 20) {
                    System.out.println(nums[a] + " + " + nums[b]);
                }
            }
        }
    }
}
