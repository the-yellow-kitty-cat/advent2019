class Day1RocketEquation {
    fun fuelRequirements(masses: List<Int>): Int {
        return masses.stream()
            .mapToInt(Int::toInt)
            .map { it / 3 }
            .map { it - 2 }
            .sum();
    }
}