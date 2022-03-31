fun main() {
    var line = readLine()
    var numCases = line?.toInt()

    for(i in 1..numCases!!){
        val days = readLine()!!.split("\\s".toRegex()).toTypedArray().map { s: String -> s.toInt() }[0]
        val monthLengths = readLine()!!.split("\\s".toRegex()).toTypedArray().map { s: String -> s.toInt() }

        var friday13ths = 0;

        var nextFriday = 6;

        while (nextFriday < days){
            if(dayOfMonth(nextFriday,monthLengths) == 13 ) friday13ths++
            nextFriday += 7
        }
        println(friday13ths)
    }
}

fun dayOfMonth(day:Int, months:List<Int>): Int {
    var dayCounter = day
    for (m in months){
        if(dayCounter <= m) return dayCounter
        dayCounter -= m
    }
    return 0
}
