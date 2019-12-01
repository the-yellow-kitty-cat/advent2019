import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.streams.toList

internal class Day1RocketEquationTest {

    @ParameterizedTest
    @CsvSource("12, 2", "14, 2", "1969, 654", "100756, 33583")
    fun fuelRequirementsExamples(mass: Int, expected: Int) {
        val masses = listOf(mass)
        Assertions.assertEquals(expected, Day1RocketEquation().fuelRequirements(masses))
    }

    @Test
    fun fuelRequirements() {
        val masses = Files.lines(Paths.get("./src/test/resources/day1.txt")).mapToInt{it.toInt()}.toList()
        Assertions.assertEquals(3437969, Day1RocketEquation().fuelRequirements(masses))
    }
}