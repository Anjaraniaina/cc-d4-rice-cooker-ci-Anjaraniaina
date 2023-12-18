package org.ricecooker;

import org.ricecooker.service.RiceCookerService;
import org.ricecooker.utils.Utils;

public class Main {
    static final RiceCookerService riceCookerService = new RiceCookerService(false, true, false);
    public static void main(String[] args) {
        welcome();
        menu();
    }
    public static void welcome(){
        Utils.print("What do you want to do ?");
    }

    public static void menu() {
        Utils.print("Type a number between the given choice.");
        Utils.print(new StringBuilder()
                .append("1. Plug in.")
                .append("\n")
                .append("2. Pour water.")
                .append("\n")
                .append("3. Put ingredient.")
                .append("\n")
                .append("4. Start.")
                .append("\n")
                .append("5. Unplug.")
                .append("\n")
                .append("6. Do something else.")
                .toString());
        String result = "";
        switch (Utils.intScanner()) {
            case 1 -> {
                result = riceCookerService.plugIn();
            }
            case 2 -> {
                result = riceCookerService.pourWater();
            }
            case 3 -> {
                result = riceCookerService.putIngredient();
            }
            case 4 -> {
                result = riceCookerService.start();
            }
            case 5 -> {
                result = riceCookerService.unPlug();
            }
            case 6 -> result = "Do something else.";
            default -> result = "Invalid input. Try again";
        }
        Utils.print(result);
        if(result != "Do something else.") {
            menu();
        }
    }
}