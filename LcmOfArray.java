import java.util.*;

public class LcmOfArray {
    /*
    Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).
    */
    public static void main(String args[]) {
      int[] arr1 = {5, 4, 6, 46, 54, 12, 13, 17};
      int[] arr2 = {46, 54, 466, 544};
      int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int[] arr4 = {13, 6, 17, 18, 19, 20, 37};
      
      System.out.println("lcmOfArray([5, 4, 6, 46, 54, 12, 13, 17]) ➞ " + lcmOfArray(arr1));
      System.out.println("lcmOfArray([46, 54, 466, 544]) ➞ " + lcmOfArray(arr2));
      System.out.println("lcmOfArray([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ " + lcmOfArray(arr3));
      System.out.println("lcmOfArray([13, 6, 17, 18, 19, 20, 37]) ➞ " + lcmOfArray(arr4));
    }
    
    public static int lcmOfArray(int[] arr){
        Arrays.sort(arr);
        int lcm = arr[arr.length-1];
        
        for(int i=0; i<arr.length; i++){
            lcm = lcmOfTwoNumbers(lcm, arr[i]);
        }
        
        return lcm;
    }
    
    public static int lcmOfTwoNumbers(int a, int b) {
        int lcm = (a > b)? a:b;
        while(lcm%a != 0 || lcm%b != 0){
            lcm++;
        }
        
        return lcm;
    }
}
