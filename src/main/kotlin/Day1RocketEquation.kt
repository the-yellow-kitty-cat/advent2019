class Day1RocketEquation {
    fun fuelRequirementsForMass(masses: List<Int>): Int {
        return masses.stream()
                .mapToInt { fuelRequirement(it) }
                .sum()
    }

    fun sumOfTotalFuelRequirements(masses: List<Int>): Int {
        return masses.stream()
                .mapToInt { fuelRequirement(it) }
                .map(this::totalFuelRequirement)
                .sum()
    }

    fun totalFuelRequirement(initialFuelRequirements: Int): Int {
        var extraFuel = fuelRequirement(initialFuelRequirements)
        var totalFuel = initialFuelRequirements
        totalFuel += extraFuel
        println(initialFuelRequirements)
        while (extraFuel > 0) {
            extraFuel = fuelRequirement(extraFuel)
            totalFuel += extraFuel
            println(extraFuel)
        }
        return totalFuel
    }

    fun fuelRequirement(mass: Int): Int {
        var fuelCalculation = (mass / 3) - 2
        if (fuelCalculation < 0) {
            fuelCalculation = 0
        }
        return fuelCalculation
    }
}