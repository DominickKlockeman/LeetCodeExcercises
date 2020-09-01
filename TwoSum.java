/*
    TwoSum problem
    My initial solution deonstrated a brute force approach. 
*/

class Solution {

    /*
    public int[] twoSum(int[] nums, int target) {
        
        // create array to hold two numbers whose sum equals target value
        int [] newArr = new int[2];

        // iterate through initial array 
        for(int i = 0; i < nums.length; i ++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
            
        }

        // return solution of two numbers
        return newArr;
    }*/


    /*
        My second approach allowed me to complete this problem using a Hashmap
    */

    public int[] twoSum(int[] nums, int target) {

        // generate array to store twosum solution
        int[] newArr = new int[2];


        // store values of the array in a hash map to reduce search time to O(1)
        Map<Integer, Integer> map = new HashMap<>();

        // iterate through the array while searching if the map contains the complement of a
        // to equal the target number.
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // insert the index of the two numbers to equal the sum of the target
            if (map.containsKey(complement)) {
                newArr[0] = map.get(complement);
                newArr[1] = i;
            }
            map.put(nums[i], i);
        }

        // if the array has a solution for the target then then the array
        // will not equal null 
        if(newArr == null) {
            newArr = null;
        } 
            
        return newArr;
    }

}

