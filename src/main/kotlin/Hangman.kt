fun main() {
    var word = readLine()
    var guess = readLine()

    var wordSet = word?.toSet()
    var uniqueLettersInWord = wordSet!!.size

    var wrongGuesses = 0
    var letterGuessed = 0
    var correctGuesses = 0


    while (correctGuesses < uniqueLettersInWord && wrongGuesses < 10){
        var letter = guess?.get(letterGuessed)
        if (!wordSet.contains(letter)){
            wrongGuesses++
            //println("Wrong: " + wrongGuesses)
        } else {
            correctGuesses++
            //println("Correct: " + correctGuesses)
        }
        letterGuessed++
    }

    if(wrongGuesses >= 10){
        println("LOSE")
    } else{
        println("WIN")
    }
}
