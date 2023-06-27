fun main() {
    var line = readLine()
    var numCases = line?.toInt()

    for(i in 1..numCases!!){
        var caseInput = readLine()
        val inputInts = caseInput!!.split("\\s".toRegex()).toTypedArray().map { s: String -> s.toInt() }
        if(inputInts[0] < inputInts[1]-inputInts[2]){
            println("advertise")
        }
        else if (inputInts[0] == inputInts[1]-inputInts[2]){
            println("does not matter")
        }
        else{
            println("do not advertise")
        }
    }
}
