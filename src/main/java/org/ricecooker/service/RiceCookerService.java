package org.ricecooker.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RiceCookerService {
    private boolean isPluggedIn;
    private boolean isEmpty;
    private boolean containWater;

    public String pourWater() {
        if(!containWater) {
            setContainWater(true);
            setEmpty(false);
            return "You poured water.";
        } else {
            return "There's already water.";
        }
    }

    public String  putIngredient() {
        setEmpty(false);
        return "You put ingredient in.";
    }

    public boolean checkIfCookedWithoutWater() {
        return !isEmpty && !containWater;
    }

    public String  plugIn() {
        if(!isPluggedIn) {
            setPluggedIn(true);
            return "You plugged in. The rice cooker is ready to use.";
        } else {
            return "It's already plugged in.";
        }
    }

    public String start() {
        if(!isPluggedIn) {
            return"The rice cooker is not plugged in yet.";
        } else {
            if(isEmpty) {
                return "There's nothing to cook yet in the rice cooker.";
            } else if (checkIfCookedWithoutWater()){
                return"You put ingredient without water.";
            } else {
                return "Ok\n " + "You can eat now.";
            }
        }
    }

    public String unPlug() {
        setPluggedIn(false);
        return "You unplugged the rice cooker.";
    }
}
