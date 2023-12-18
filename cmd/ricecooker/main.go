package main

import (
	"fmt"
	"rice-cooker-go/pkg/service"
	"rice-cooker-go/utils"
)

var riceCookerService = &service.RiceCookerService{IsPluggedIn: false, IsEmpty: true, ContainsWater: false}

func welcome() {
	fmt.Println("What do you want to do?")
}

func menu() {
	fmt.Println(`Type a number between the given choices.
		1. Plug in.
		2. Pour water.
		3. Put ingredient.
		4. Start.
		5. Unplug.
		6. Do something else.`)

	choice := utils.IntScanner()
	var result string

	switch choice {
	case 1:
		result = riceCookerService.PlugIn()
	case 2:
		result = riceCookerService.PourWater()
	case 3:
		result = riceCookerService.PutIngredient()
	case 4:
		result = riceCookerService.Start()
	case 5:
		result = riceCookerService.UnPlug()
	case 6:
		result = "You chose to do something else."
	default:
		result = "Invalid choice. Try again."
	}

	fmt.Println(result)

	if result != "You chose to do something else." {
		menu()
	}
}

func main() {
	welcome()
	menu()
}
