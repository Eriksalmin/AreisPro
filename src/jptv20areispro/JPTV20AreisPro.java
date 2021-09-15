/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20areispro;

/**
 *
 * @author pupil
 */
public class JPTV20AreisPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Исследование массивов JAVA");
        System.out.println("Одномерный массив");
        int[] nums;
        nums = new int[5];
        int[] nums1;
        nums[1] = 1;
        System.out.print("nums = [");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("");
        int[] nums2;
        nums2 = nums;
    }
    
}
