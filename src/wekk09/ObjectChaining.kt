package week09 // Fixed typo from 'wekk09'

// If you want to use your local Data Class, you don't need the external student import
data class Person(val name: String, val gpa: Double)

fun main() {
    // Using the 'Person' data class defined above
    val students = listOf(
        Person("Andi", 3.2),
        Person("Budi", 3.9),
        Person("Citra", 2.8),
        Person("Dewi", 3.7)

    )

    println("=== HONOR STUDENTS PIPELINE ===")

    val honorNames = students
        .filter { it.gpa >= 3.5 }
        .sortedBy { it.name }
        .map {it.name.uppercase()}

    honorNames.forEach { println("Honor Roll: $it") }

}