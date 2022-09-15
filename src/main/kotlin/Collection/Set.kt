package Collection

fun main() {
    var list=LinkedHashSet<String>()
    list.add("Hello1")
    list.add("Hello2")
    list.add("Hello2")
    list.add("Hello12")
    list.add("Hello217")

    list.add("Hello212312")
    list.add("2")
    list.add("Hello211")

    println(list.elementAt(2))
    println(list)
    println(list.contains("2"))
    list.remove("2")
    println(list)
    println(list.size)

    var list2=HashSet<String>(list)
    var list3=HashSet<String>(100)
    list.addAll(list2)
    println(list)


}