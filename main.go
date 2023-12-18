package main

import (
	"rice-cooker-go/service"
	"rice-cooker-go/utils"
)

var riceCookerService = &service.RiceCookerService{IsPluggedIn: false, IsEmpty: true, ContainsWater: false}

func welcome() {
	utils.Print("What do you want to do?")
}

func menu() {
	utils.Print("Type a number between the given choices.")
	utils.Print("1. Plug in.")
	utils.Print("2. Pour water.")
	utils.Print("3. Put ingredient.")
	utils.Print("4. Start.")
	utils.Print("5. Unplug.")
	utils.Print("6. Do something else.")

	switch utils.IntScanner() {
	case 1:
		riceCookerService.PlugIn()
		menu()
	case 2:
		riceCookerService.PourWater()
		menu()
	case 3:
		riceCookerService.PutIngredient()
		menu()
	case 4:
		riceCookerService.Start()
		menu()
	case 5:
		riceCookerService.UnPlug()
		menu()
	case 6:
		utils.Quit()
	default:
		utils.Print("Invalid choice. Try again.")
	}
}

func main() {
	welcome()
	menu()
}