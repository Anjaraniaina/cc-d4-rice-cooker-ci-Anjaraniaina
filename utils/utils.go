package utils

import (
	"fmt"
	"strconv"
)

func Print(sentence string) {
	fmt.Println(sentence)
}

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
	Print("Not implemented yet.")
}

func Quit() {
	Print("See you later!")
}