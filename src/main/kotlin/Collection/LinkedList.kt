package Collection

import java.util.LinkedList

fun main() {
    var list = LinkedList<String>()
    list.add("rostov")
    list.add("mosscow")
    list.add("Сочи")

    println(list)

    for (s in list) {
        println(s)
    }


    var list2:List<String> = arrayListOf("h1","h2","h3","h4","h5")
    list2 = LinkedList<String>()
}