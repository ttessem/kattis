fun main(){
    val numBooks = readln().toInt()
    val books = mutableListOf<Int>()
    for(i in 1 .. numBooks){
        books.add(readln().toInt())
    }
    var price = 0
    books.sortedDescending().forEachIndexed{i, book -> if(i%3 != 2) price += book}
    println(price)
}