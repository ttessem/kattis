import kotlin.math.min

fun main(){
    var line = readLine()
    var Ts = 0
    var Cs = 0
    var Gs = 0

    for(i in line!!.indices){
        if (line[i] == 'T') Ts++
        if (line[i] == 'C') Cs++
        if (line[i] == 'G') Gs++
    }

    var bonus = min(min(Ts,Cs),Gs) * 7

    var result = sqr(Ts)+sqr(Cs)+sqr(Gs)+bonus

    println(result)
}

fun sqr(x: Int): Int {
    return x * x
}