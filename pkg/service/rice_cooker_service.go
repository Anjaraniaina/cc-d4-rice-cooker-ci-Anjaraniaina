package service

type RiceCookerService struct {
	IsPluggedIn   bool
	IsEmpty       bool
	ContainsWater bool
}

func (rcs *RiceCookerService) PourWater() string {
	if !rcs.ContainsWater {
		rcs.ContainsWater = true
		rcs.IsEmpty = false
		return "You poured water."
	} else {
		return "There's already water."
	}
}

func (rcs *RiceCookerService) PutIngredient() string {
	rcs.IsEmpty = false
	return "You put ingredient in."
}

func (rcs *RiceCookerService) CheckIfCookedWithoutWater() bool {
	return !rcs.IsEmpty && !rcs.ContainsWater
}

func (rcs *RiceCookerService) PlugIn() string {
	if !rcs.IsPluggedIn {
		rcs.IsPluggedIn = true
		return "You plugged in. The rice cooker is ready to use."
	} else {
		return "It's already plugged in."
	}
}

func (rcs *RiceCookerService) Start() string {
	if !rcs.IsPluggedIn {
		return "The rice cooker is not plugged in yet."
	} else {
		if rcs.IsEmpty {
			return "There's nothing to cook yet in the rice cooker."
		} else if rcs.CheckIfCookedWithoutWater() {
			return "You put ingredient without water."
		} else {
			return "Ok \n" + "You can eat now."
		}
	}
}

func (rcs *RiceCookerService) UnPlug() string {
	rcs.IsPluggedIn = false
	return "You unplugged the rice cooker."
}
