package org.ricecooker.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ricecooker.Main;
import org.ricecooker.utils.Utils;

@Data
@AllArgsConstructor
public class RiceCookerService {
    private boolean isPluggedIn;
    private boolean isEmpty;
    private boolean containWater;

    public void pourWater() {
        if(!containWater) {
            setContainWater(true);
            setEmpty(false);
            Utils.print("You poured water.");
        } else {
            Utils.print("There's already water.");
        }
    }

    public void putIngredient() {
        setEmpty(false);
        Utils.print("You put ingredient in.");
    }

    public boolean checkIfCookedWithoutWater() {
        return !isEmpty && !containWater;
    }

    public void plugIn() {
        if(!isPluggedIn) {
            setPluggedIn(true);
            Utils.print("You plugged in. The rice cooker is ready to use.");
        } else {
            Utils.print("It's already plugged in.");
        }
    }

    public void start() {
        if(!isPluggedIn) {
            Utils.print("The rice cooker is not plugged in yet.");
        } else {
            if(isEmpty) {
                Utils.print("There's nothing to cook yet in the rice cooker.");
            } else if (checkIfCookedWithoutWater()){
                Utils.print("You put ingredient without water.");
            } else {
                Utils.print("Ok");
                Utils.print("You can eat now.");
            }
        }
    }

    public void unPlug() {
        setPluggedIn(false);
        Utils.print("You unplugged the rice cooker.");
    }
}
