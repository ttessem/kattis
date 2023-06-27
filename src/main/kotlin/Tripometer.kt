
fun main(){
    val numDistance = readLine()!!.toInt();
    val distances = readLine()!!.split(' ').map { it.toInt() }

    val sum = distances.sum()

    val resultSet = distances.map { i -> sum - i}.distinct().sorted()

    println(resultSet.size)
    println(resultSet.joinToString(" "))
}