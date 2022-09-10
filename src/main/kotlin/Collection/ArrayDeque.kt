package Collection

fun main() {
    var collection1 = listOf<Int>(1,2,3,4,5)
    var list = ArrayDeque<Int>(collection1)
    println(list)

    list.addFirst(0)
    println(list)
    list.addLast(6)
    println(list)

    println(list.first())
    println(list.firstOrNull())

    println(list.last())
    println(list.lastOrNull())

    println(list.removeFirst())
    println(list)

}