package Collection

fun main() {
    //не изменяемая коллекция
    var mapList = mapOf<Int?,String>(null to "Rostov" , 200 to "Mosscow")
    println(mapList)


    //изменяемая коллекция
    var mapList2 = mutableMapOf<Int,String>(222 to "SP" , 333 to "vladiwastok")
    mapList2.set(333,"Mary")
    println(mapList2)
    var mapList3 = HashMap<Int ,String>(mapList2)
    mapList3.put(666,"Ashgabat")
    mapList3.remove(222)
    mapList3.put(666,"balkan")
    for (mutableEntry in mapList3) {
        println(" ${mutableEntry.key} ${mutableEntry.value}" )


    }

}