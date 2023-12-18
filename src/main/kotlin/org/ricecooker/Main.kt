package org.ricecooker

import org.ricecooker.service.RiceCookerService
import org.ricecooker.utils.Utils

val riceCookerService = RiceCookerService(isPluggedIn = false, isEmpty = false, containWater = false)

fun welcome() {
    Utils.print("What do you want to do?")
}

fun menu() {
    Utils.print("Type a number between the given choice.")
    Utils.print("""
        |1. Plug in.
        |2. Pour water.
        |3. Put ingredient.
        |4. Start.
        |5. Unplug.
        |6. Do something else.
    """.trimMargin())

    var result: String
    when (Utils.intScanner()) {
        1 -> {
            result = riceCookerService.plugIn()
        }
        2 -> {
            result = riceCookerService.pourWater()
        }
        3 -> {
            result = riceCookerService.putIngredient()
        }
        4 -> {
            result = riceCookerService.start()
        }
        5 -> {
            result = riceCookerService.unPlug()
        }
        6 -> result = "Do something else."
        else -> result = "Invalid input. Try again"
    }

    Utils.print(result)
    if (!result.equals("Do something else.")) {
        menu()
    }
}

fun main() {
    welcome()
    menu()
}