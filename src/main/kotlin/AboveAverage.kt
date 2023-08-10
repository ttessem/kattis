import java.text.DecimalFormat

fun main() {
    val testCases = readLine()!!.toInt()
    val percentFormat = DecimalFormat("##.###%")

    for (i in 1..testCases) {
        val grades = readLine()!!.split("\\s".toRegex()).toTypedArray().map { s: String -> s.toInt() }

        val avg = grades.subList(1, grades.size).map { i -> i.toDouble() }.average()
        val overAvg = grades.subList(1,grades.size).filter { i -> i.toDouble() > avg }.size.toDouble()
        val exactAnswer = (overAvg/grades[0])

        val formatted = String.format("%.3f", (exactAnswer*100))+"%"
        println(formatted)
    }
}