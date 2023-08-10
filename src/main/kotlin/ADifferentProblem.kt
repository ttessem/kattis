import kotlin.math.abs

fun main() {
    var input = readlnOrNull()
    while (input != null){
        val attempt = input.split("\\s".toRegex()).toTypedArray().map { i -> i.toLong() }
        println(abs(attempt[0]-attempt[1]))
        input = readlnOrNull()
    }
}