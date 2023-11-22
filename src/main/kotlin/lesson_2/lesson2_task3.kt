package lesson_2

import kotlin.math.min

fun main() {
    val trainDepartureTime = "9:39"
    val travelTime = 457

    val time = trainDepartureTime.split(":")
    val hours = time[0].toString().toInt()
    val minutes = time[1].toString().toInt()

    var hoursArrival = hours + travelTime / 60
    if (hoursArrival > 23) {
        hoursArrival -= 24
    }
    var minutesArrival = minutes + travelTime % 60
    if (minutesArrival > 59) {
        minutesArrival -= 60
        hoursArrival += 1
    }
    val h = "%02d".format(hoursArrival)
    val m = "%02d".format(minutesArrival)
    val trainArrivalTime = "$h:$m"
    println("Время пребытия поезда: $trainArrivalTime")
}