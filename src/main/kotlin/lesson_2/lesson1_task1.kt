package lesson_2

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5
    val arithmeticMean:Double = ((student1+student2+student3+student4 + 0.0)/4)
    println("Средний бал по классу: ${"%.2f".format(arithmeticMean)}")
}