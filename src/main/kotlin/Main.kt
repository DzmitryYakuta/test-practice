import kotlin.random.Random

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4, 5)

    val newList = list.map { it + it }

    newList.forEach{println(it)}

}

fun printArray(item: List<Any>) {
    for (i in 1..item.size) {
        println("Element #$i - ${item[i-1]}")
    }

}
