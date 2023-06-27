import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val input = readLine()!!.split(' ').map { num -> num.toInt() }
    val s00 = input[0]
    val s01 = input[1]
    val s10 = input[2]
    val s11 = input[3]

    val numZeros = calc(s00)
    val numOnes = calc(s11)
    val num0 = numZeros.toInt()
    val num1 = numOnes.toInt()

    //println("$num0 $num1")

    if (!isInteger(numZeros) || !isInteger(numOnes)) {
        println("impossible")
    }
    else if (num0 * num1 != s01 + s10) {
        if(s01 == 1 && s10 == 0){
            println("01")
        }
        else if(s01 == 0 && s10 == 1){
            println("10")
        }
        else{
            println("impossible")
        }
    }
    else if (s00 == 0 && s11== 0){
        println("impossible")
    }
    else {
        println(buildString(num0, num1, s01, s10))
    }
}


fun buildString(numZeroes: Int, numOnes: Int, s01: Int, s10: Int): String {
    var s = ""
    for (i in 1..numZeroes) {
        s += "0"
    }

    var count = s01
    var count1s = numOnes

    while (count > 0) {
        //println(count)
        if (count > numZeroes) {
            s += "1"
            count -= numZeroes
            count1s--
        } else {
            s = s.addCharAtIndex('1', count)
            count = 0
            count1s--
        }
    }

    for (i in 1..count1s) {
        s = "1$s"
    }

    return s
}

fun String.addCharAtIndex(char: Char, index: Int) =
    StringBuilder(this).apply { insert(index, char) }.toString()

fun calc(num: Int): Double {
    if (num == 0) {
        return 0.0
    }
    val a = num.toDouble()
    val b = 1 + (8 * a)
    val c = sqrt(b)
    val d = 0.5 * (1 + c)
    return d
}

fun isInteger(num: Double): Boolean {
    return ceil(num) == floor(num)
}


