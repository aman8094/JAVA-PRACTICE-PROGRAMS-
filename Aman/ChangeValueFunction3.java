package com.Aman;

import java.util.Arrays;

public class ChangeValueFunction3 {
    public static void main(String[] args) {



    int[] arr = {1,2,3,4,5,6};
      change(arr);
        System.out.println(Arrays.toString(arr));
}
static void change(int[] nums){
    nums[0] = 99;//if you make a change to the object via ref variable,same object will be changed

}}