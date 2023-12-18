package utils

import (
	"fmt"
	"strconv"
)

func IntScanner() int {
	for {
		var input string
		fmt.Scanln(&input)

		if value, err := strconv.Atoi(input); err == nil {
			return value
		}

		fmt.Println("Invalid input. Please enter a number.")
	}
}

func NotImplemented() {
	fmt.Println("Not implemented yet.")
}

func Quit() {
	fmt.Println("See you later!")
}
