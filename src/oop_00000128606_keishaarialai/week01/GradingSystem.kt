package oop_00000128606_keishaarialai.week01

fun main(){
    var name = "Keisha Lai"
    var score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade: $grade")
    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null
    // jika null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
