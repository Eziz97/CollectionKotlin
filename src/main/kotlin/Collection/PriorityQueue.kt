package Collection

import java.util.PriorityQueue

fun main() {
    //����������
    var list = PriorityQueue<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.offer(2)

    println(list.element())//������� ������� ������ ������ ������
    println(list.peek())  //������� ������� ������ ������ ������
    list.clear()//������� ������
    var n  = list.poll()//������ ������� �� �������

    //println(list.element())

}