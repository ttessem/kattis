import kotlin.math.ceil
import kotlin.math.sqrt

fun main() {
    var input = readln().toInt()
    var numFactors = 0
    val primes = findPrimesUnder(ceil(sqrt(input.toDouble())).toInt())

    while (input > 1) {
        primeChecker@ for (p in primes) {
            if (input % p == 0) {
                numFactors++
                input /= p
                break@primeChecker
            }
            if (p > (sqrt(input.toDouble())) || primes.last() == p) {
                numFactors++
                input /= input
                break@primeChecker
            }
        }
    }
    println(numFactors)
}

fun findPrimesUnder(lim: Int): List<Int> {
    val primes = mutableListOf<Int>()
    if (lim < 2) return primes
    primes.add(2)
    if (lim < 3) return primes
    for (i in 3..lim) {
        var isPrime = true
        inner@ for (p in primes) {
            if (i % p == 0) isPrime = false
            if (p > sqrt(i.toDouble())) break@inner
        }
        if (isPrime) primes.add(i)
    }
    return primes
}