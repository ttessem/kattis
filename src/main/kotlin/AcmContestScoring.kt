fun main(){

    var score = 0
    var time = 0

    var solved = mutableSetOf<String>()
    var failedAttempts = mutableMapOf<String,Int>()

    var input = readln()
    while (input != "-1"){
        val attempt = input.split("\\s".toRegex()).toTypedArray()
        if(attempt[2] == "right"){
            if(!solved.contains(attempt[1])){
                solved.add(attempt[1])
                score++
                time += attempt[0].toInt()
                if(failedAttempts.containsKey(attempt[1])){
                    time += failedAttempts[attempt[1]]!!
                }
            }
        } else {
            if(!solved.contains(attempt[1])){
                val prevPenalty = failedAttempts[attempt[1]]

                if(prevPenalty == null){
                    failedAttempts[attempt[1]] = 20
                } else {
                    failedAttempts[attempt[1]] = prevPenalty + 20
                }
            }
        }
        input = readln()
       // println(String.format("%s %s", score, time))
    }
    println(String.format("%s %s", score, time))
}