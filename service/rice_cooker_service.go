package service

import (
	"rice-cooker-go/utils"
)

type RiceCookerService struct {
	IsPluggedIn   bool
	IsEmpty       bool
	ContainsWater bool
}

func (rcs *RiceCookerService) PourWater() {
	if !rcs.ContainsWater {
		rcs.ContainsWater = true
		rcs.IsEmpty = false
		utils.Print("You poured water.")
	} else {
		utils.Print("There's already water.")
	}
}

func (rcs *RiceCookerService) PutIngredient() {
	rcs.IsEmpty = false
	utils.Print("You put ingredient in.")
}

func (rcs *RiceCookerService) CheckIfCookedWithoutWater() bool {
	return !rcs.IsEmpty && !rcs.ContainsWater
}

func (rcs *RiceCookerService) PlugIn() {
	if !rcs.IsPluggedIn {
		rcs.IsPluggedIn = true
		utils.Print("You plugged in. The rice cooker is ready to use.")
	} else {
		utils.Print("It's already plugged in.")
	}
}

func (rcs *RiceCookerService) Start() {
	if !rcs.IsPluggedIn {
		utils.Print("The rice cooker is not plugged in yet.")
	} else {
		if rcs.IsEmpty {
			utils.Print("There's nothing to cook yet in the rice cooker.")
		} else if rcs.CheckIfCookedWithoutWater() {
			utils.Print("You put ingredient without water.")
		} else {
			utils.Print("Ok")
			utils.Print("You can eat now.")
		}
	}
}

func (rcs *RiceCookerService) UnPlug() {
	rcs.IsPluggedIn = false
	utils.Print("You unplugged the rice cooker.")
}