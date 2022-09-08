package Collection

import java.util.*

fun main() {
    var list = Vector<String>()
    list.add("1")
    list.add("2")
    list.add("3")

   println(list.lastElement())
   println(list.firstElement())
   println(list.get(1))

    var list2 = Stack<String>()
    list2.push("hello1")
    list2.push("hello2")
    println(list2.pop())
    println(list2.pop())

    println(list2)
}