fun main(){

    val sol = MutableList(15){ HashMap<Pair<Int, Int>, Int>() }

    sol[0][Pair(0,0)] = 1

    for (step in 1 .. 14){
        for(i in -15 .. 15){
            for(j in -15 .. 15){
                var temp = 0;
                // naboer (i-2,j), (i+2,j), (i-1,j-1), (i+1, j-1), (i-1,j+1) (i+1, j+1)
                temp += sol[step-1].getIfNull(Pair(i-2,j))
                temp += sol[step-1].getIfNull(Pair(i+2,j))
                temp += sol[step-1].getIfNull(Pair(i-1,j-1))
                temp += sol[step-1].getIfNull(Pair(i+1,j-1))
                temp += sol[step-1].getIfNull(Pair(i-1,j+1))
                temp += sol[step-1].getIfNull(Pair(i+1,j+1))

                sol[step][Pair(i,j)] = 0
            }
        }
    }

    val testcases = readLine()!!.toInt()

    for (i in 1 .. testcases){
        val num = readLine()!!.toInt()
        println(sol[num][Pair(0,0)])
    }

}

fun HashMap<Pair<Int, Int>, Int>.getIfNull(key : Pair<Int,Int>) : Int {
    if (this[key] == null){
        return 0
    } else {
        return this[key]!!
    }
}