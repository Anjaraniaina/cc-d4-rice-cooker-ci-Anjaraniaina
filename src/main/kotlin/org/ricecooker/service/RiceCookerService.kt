package org.ricecooker.service

data class RiceCookerService(
    var isPluggedIn: Boolean,
    var isEmpty: Boolean,
    var containWater: Boolean
) {
    fun pourWater(): String {
        return if (!containWater) {
            containWater = true
            isEmpty = false
            "You poured water."
        } else {
            "There's already water."
        }
    }

    fun putIngredient(): String {
        isEmpty = false
        return "You put ingredient in."
    }

    fun checkIfCookedWithoutWater(): Boolean {
        return !isEmpty && !containWater
    }

    fun plugIn(): String {
        return if (!isPluggedIn) {
            isPluggedIn = true
            "You plugged in. The rice cooker is ready to use."
        } else {
            "It's already plugged in."
        }
    }

    fun start(): String {
        return if (!isPluggedIn) {
            "The rice cooker is not plugged in yet."
        } else {
            when {
                isEmpty -> "There's nothing to cook yet in the rice cooker."
                checkIfCookedWithoutWater() -> "You put ingredient without water."
                else -> "Ok\nYou can eat now."
            }
        }
    }

    fun unPlug(): String {
        isPluggedIn = false
        return "You unplugged the rice cooker."
    }
}