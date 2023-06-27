import java.math.BigInteger
import java.util.TreeMap

fun main() {
    val input = readLine()!!.split(' ')
    val numContest = input[0].toInt()
    val randNum = (input[1]).toBigInteger()

    val participants = TreeMap<BigInteger, String>()

    for (i in 1..numContest) {
        val contestantInfo = readLine()!!.split(' ')
        participants.put(contestantInfo[1].toBigInteger(), contestantInfo[0])
    }

    val nums = participants.keys.sortedDescending()

    //println("" + nums + " " + randNum)

    val solved = solve(nums, randNum)

    if(solved.isEmpty()){
        println("0")
    } else {
        println(solved.size)
        for (num in solved){
            println(participants[num])
        }
    }
}

fun solve(numbers: List<BigInteger>, number: BigInteger): List<BigInteger> {
    if (numbers.isEmpty()) return emptyList()
    if (numbers.size == 1 && numbers[0] != number) return emptyList()

    val highest = numbers[0]

    return if (highest == number) listOf(number)
    else if (number > highest.times(BigInteger.TWO)) return emptyList();
    else if (number > highest) {
        val recStep = solve(numbers.drop(1), number.subtract(highest))
        return if (recStep.isEmpty()) {
            emptyList()
        } else {
            listOf(highest) + recStep
        }
    } else solve(numbers.drop(1), number)
}