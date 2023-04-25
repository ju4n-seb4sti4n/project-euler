package main

import "fmt"

func main() {

	const Limit = 1000
	var sumOfMultiples int = 0
	for i := 1; i < Limit; i++ {
		if i%3 == 0 || i%5 == 0 {
			sumOfMultiples += i
		}
	}
	fmt.Printf("the sum of all multiples of 3 or 5 below %d is %d\n", Limit, sumOfMultiples)
}
