/*


*/

function threeSum(nums: number[]): number[][] {    
    nums.sort((a, b) => a - b);   //sort non decreasing
    const res : number[][] = [];
    const n = nums.length;
    for (let i = 0; i < n-1;i++){
        if (i > 0 && nums[i] === nums[i-1]) continue;
        let j = i + 1;
        let k = n -1;
        while (j < k){
            const sum = nums[i] + nums[j] + nums[k];
            if (sum == 0){
                res.push([nums[i], nums[j], nums[k]]);
                while (j < k && nums[j] === nums[j +1]) j++;
                while (j < k && nums[k] === nums[k -1]) k--;            
                j++;
                k--;
            } else if (sum < 0){
                    j++;
                   } else {
                    k--;
                   }
            
        }    
}
    return res;
};


function main(){
const nums = [-1,0,1,2,-1,-4];
let result = threeSum(nums);

console.dir("Result: " + result)



}
main();