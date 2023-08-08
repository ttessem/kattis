fun main() {
    val number = readLine()!!.toInt()
    val mod = number%100
    if(number < 100){
        println(99)
    }
    else if(mod < 49) {
        println(number-(mod+1))
    } else {
        println(number+(100-(mod+1)))
    }
}