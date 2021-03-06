package leetcode

func mySqrt(x int) int {
	var l, r, ans, mid int
	l = 0
	r = x
	ans = -1
	for l <= r {
		mid = l + (r-l)/2
		if mid*mid <= x {
			ans = mid
			l = mid + 1
		} else {
			r = mid - 1
		}
	}
	return ans
}
