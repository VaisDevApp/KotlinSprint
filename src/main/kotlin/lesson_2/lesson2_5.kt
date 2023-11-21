package lesson_2

fun main() {
    val countMoneyBegin = 70000
    val percentYear = 16.7
    val countYear = 20
    var countMoneyEnd = countMoneyBegin.toDouble()
    for (i in 1..countYear) {
        countMoneyEnd = countMoneyEnd + countMoneyEnd * percentYear / 100
    }
    println(String.format("%.3f", countMoneyEnd))
}