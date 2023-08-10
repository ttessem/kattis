import java.text.DecimalFormat

fun main() {
    val testCases = readLine()!!.toInt()

    for (i in 1..testCases) {
        val grades = readLine()!!.split("\\s".toRegex()).toTypedArray().map { s: String -> s.toInt() }

        val avg = grades.subList(1, grades.size).map { grade -> grade.toDouble() }.average()
        val overAvg = grades.subList(1, grades.size).filter { grade -> grade.toDouble() > avg }.size.toDouble()
        val exactAnswer = (overAvg/grades[0])

        val formatted = String.format("%.3f", (exactAnswer*100))+"%"
        println(formatted)
    }
}