package org.ricecooker.utils

import java.util.Scanner

object Utils {
    private val scanner = Scanner(System.`in`)

    fun print(sentence: String) {
        println(sentence)
    }

    fun intScanner(): Int {
        try {
            return scanner.nextInt()
        } catch (e: Exception) {
            print("Invalid input")
            scanner.nextLine()
        }
        return 0
    }

    fun notImplemented() {
        print("Not implemented yet.")
    }

    fun quit() {
        print("See you later !")
    }
}