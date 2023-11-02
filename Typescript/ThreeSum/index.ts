/*

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    
    if (nums.length == 3) {
        if (nums[0] + nums[1] + nums[2] == 0) {
            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[0]);
            triplet.add(nums[1]);
            triplet.add(nums[2]);
            res.add(triplet);
        }
        return res;
    }
    
    return res;
}
}


Sort the given array in non-decreasing order.
Loop through the array from index 0 to n-1.
For each iteration, set the target as -nums[i].
Set two pointers, j=i+1 and k=n-1.
While j<k, check if nums[j]+nums[k]==target.
If yes, add the triplet {nums[i], nums[j], nums[k]} to the result and move j to the right and k to the left.
If no, move either j or k based on the comparison of nums[j]+nums[k] with target.
To avoid duplicate triplets, skip the iterations where nums[i]==nums[i-1] and also skip the iterations where nums[j]==nums[j-1] or nums[k]==nums[k+1].
*/

function threeSum(nums: number[]): number[][] {    
    nums.sort((a, b) => a - b);   
    const dblArray : number[][] = [];
    const n = nums.length;
    for (let i = 0; i < n-1;i++){
        let target = -nums[i];
        let j = i + 1;
        let k = n -1;
        while (j < k){
            if (nums[i]===nums[i-1]) break;
            if (nums[j]===nums[j-1]) break;
            if (nums[k]===nums[k+1]) break;
         
            if (nums[j] + nums[k] == target){
                let triplet = [nums[i], nums[j], nums[k]];
                dblArray.push(triplet);
                j++;
                k--; //verify
            } else{
                   if (nums[j] + nums[k] < target){
                      j++;
                  } else {
                    k--;
                  }
            
        }
    }
}
    return dblArray;
};


function main(){
const nums = [-1,0,1,2,-1,-4];
let result = threeSum(nums);



}
main();