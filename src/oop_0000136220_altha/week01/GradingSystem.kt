package oop_0000136220_altha.week01

fun main () {
    var name: String = "jhon Thor"
    var score: Int = 80


    println("Name: " + name + ", Nilai: " + score)

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..100 -> "B"
        in 70..100 -> "C"
        else -> "D"

    }
    println(grade)

        fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

                println ("Status: ${calculateStatus(score)}")

    val studentId: String? = null

    val idLength = studentId?.length ?: 0

    println ("Panjang ID: $idLength")



    }
}

