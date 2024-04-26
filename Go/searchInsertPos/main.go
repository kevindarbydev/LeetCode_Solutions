package main

import "fmt"

func searchInsert(nums []int, target int) int {
	pos := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] >= target {
			return i
		} else {
			pos = pos + 1
		}
	
	}
	return pos	
}

func main() {
	fmt.Println("here");
}
