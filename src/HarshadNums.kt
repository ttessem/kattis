fun main() {
    var line = readLine()
    while (line != null) {
        println(findNextHarshad(line.toInt()))
        line = readLine()
    }
}

fun findNextHarshad(i : Int): Int{
    var num = i;
    while (!isHarshad(num) && num <= 1_000_000_000){
        num++
    }
    return num
}

fun isHarshad(i: Int): Boolean {
    return i%sumOfDigits(i) == 0
}

fun sumOfDigits(i: Int): Int {
    var sum = 0;
    var num = i;
    while (num>0){
        sum += num%10
        num /= 10;
    }
    return sum
}
