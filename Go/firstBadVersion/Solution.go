package main
import "fmt"
/* 
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version, all the versions
after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first 
bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version
is bad. Implement a function to find the first bad version. You should 
minimize the number of calls to the API.
*/

/** 
 * Forward declaration of isBadVersion API.
 * @param   version   your guess about first bad version
 * @return 	 	      true if current version is bad 
 *			          false if current version is good
 * func isBadVersion(version int) bool;
 */
func isBadVersion(version int) bool {
	return true
}

 func firstBadVersion(n int) int {
    half := n / 2
	fmt.Println(half)
	for i := 1; i < n; i++ {
		if isBadVersion(i) {
			return i
		}
	}
	return 0
		
}
func main() {
	firstBadVersion(5)
}