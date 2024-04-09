// practicing Go
func twoSum(nums []int, target int) []int {
    for(int i=0; i < len(nums); i++){
		for(int j=i+1; j < len(nums); j++){
			if (nums[i] + nums[j] == target){
				return []int{i, j}
			}
		}	
	}
}