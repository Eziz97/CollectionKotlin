package Collection

import java.util.PriorityQueue

fun main() {
    //изменяемый
    var list = PriorityQueue<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.offer(2)

    println(list.element())//получит элемент которы первый пришол
    println(list.peek())  //получит элемент которы первый пришол
    list.clear()//очистит очеред
    var n  = list.poll()//удалит элемент из очереди

    //println(list.element())

}