import kotlin.random.Random

fun main(args: Array<String>) {

    val userInputN = userInputN()
    var telefonList = MutableList()
    for (i in 1..userInputN) {
    
    }

}

fun printArray(item: List<Any>) {
    for (i in 1..item.size) {
        println("Element #$i - ${item[i-1]}")
    }

}

fun userInputN(): Int {
    var n = 0
    while (true) {
        println("Enter number N above zero: ")
        n = readLine()?.toIntOrNull() ?: -1
        if (n > 0) break
        }
    return n
    }
