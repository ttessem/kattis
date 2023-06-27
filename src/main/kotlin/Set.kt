fun main() {

    var cards = mutableListOf<String>()
    cards.addAll(readLine()!!.split(' '))
    cards.addAll(readLine()!!.split(' '))
    cards.addAll(readLine()!!.split(' '))
    cards.addAll(readLine()!!.split(' '))

    var sets = mutableListOf<String>()

    for (i in 1..10) {
        for (j in i + 1..11)
            for (k in j + 1..12) {
                val set = "$i $j $k"
                if (matches(cards[i-1], cards[j-1], cards[k-1])) {
                    sets.add(set)
                }
            }
    }

    if (sets.isEmpty()){
        println("no sets")
    } else {
        sets.forEach { s -> println(s) }
    }
}

fun matches(card1: String, card2: String, card3: String): Boolean {
    var isMatch = true

    for (i in 0..3) {
        var checker = HashSet<Char>()
        checker.add(card1[i])
        checker.add(card2[i])
        checker.add(card3[i])
        if (checker.size == 2) isMatch = false
    }
    return isMatch
}