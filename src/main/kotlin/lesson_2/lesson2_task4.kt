package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    baf20CrystalOre(crystalOre)
    baf20IronOre(ironOre)
}

fun baf20CrystalOre(value: Int) {
    val baf20 = value * 20/100
    println("Количество \"бонусных\" crystal ore: $baf20")
}

fun baf20IronOre(value: Int) {
    val baf20 = value * 20/100
    println("Количество \"бонусных\" iron ore: $baf20")
}