package lesson_1

fun main() {
    val seconds: Short = 5409
    val hours: Int = seconds / 3600
    val minuts: Int = (seconds - hours * 3600) / 60
    val remainsSeconds = seconds - hours * 3600 - minuts * 60
    println("0$hours:$minuts:0$remainsSeconds")
}