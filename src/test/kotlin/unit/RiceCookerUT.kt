package unit

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.ricecooker.service.RiceCookerService
import org.ricecooker.utils.Utils
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class RiceCookerUT {

    private val outputStreamCaptor = ByteArrayOutputStream()
    private val riceCookerService = RiceCookerService(isEmpty = true, isPluggedIn = false, containWater = false)

    @Before
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @After
    fun tearDown() {
        System.setOut(System.out)
    }

    @Test
    fun print_test_ok() {
        Utils.print("Test message")
        assertEquals("Test message", outputStreamCaptor.toString().trim())
    }

    @Test
    fun print_welcome_ok() {
        Utils.notImplemented()
        assertEquals("Not implemented yet.", outputStreamCaptor.toString().trim())
    }

    @Test
    fun put_ingredient_ok() {
        var result: String = riceCookerService.putIngredient()

        assertEquals("You put ingredient in.", result)
        assertEquals(false, riceCookerService.isEmpty)
    }
}