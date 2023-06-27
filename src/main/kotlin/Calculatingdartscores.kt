fun main(){
    val target = readLine()!!.toInt()

    val throws = Array<String> (181) {"impossible"}
    val posThrows = HashMap<Int,String>()

    for(t in 1..20) {
        posThrows[t*3] = ("triple $t")
        throws[t*3] = ("triple $t")
        posThrows[t*2] = ("double $t")
        throws[t*2] = ("double $t")
        posThrows[t] = ("single $t")
        throws[t] = ("single $t")
    }

    val oneThrow = throws.clone()

    for(t in 23 .. 120) {
        if(oneThrow[t] == "impossible"){
            for (posT in 1 .. 60){
                if(posThrows.containsKey(posT) && t-posT > 0 && oneThrow[t-posT] != "impossible"){
                    throws[t] = oneThrow[t-posT] + "\n" + posThrows[posT]
                    //println(""+ t + ": " + throws[t])
                    break
                }
            }
        }
    }

    val twoThrow = throws.clone()

    for(t in 23 .. 180) {
        if(twoThrow[t] == "impossible"){
            for (posT in 1 .. 60){
                if(posThrows.containsKey(posT) && t-posT > 0 && twoThrow[t-posT] != "impossible"){
                    throws[t] = twoThrow[t-posT] + "\n" + posThrows[posT]
                    //println(""+ t + ": " + throws[t])
                    break
                }
            }
        }
    }

    println(throws[target])
}