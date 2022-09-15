package Collection

import java.util.TreeSet

fun main() {
    var list11 = listOf<Int>(1,3,2,23,2,1)
    var list=TreeSet<Int>(Comparator { o1, o2 -> o2 - o1  })


    list.add(8)
    list.add(7)
    list.add(3)
    list.add(2)
    list.add(1)

    println(list)



    var list2=TreeSet<String>(Comparator { o1, o2 -> o1.length.compareTo(o2.length)  })
    list2.add("garry")
    list2.add("ron")
    list2.add("anna")
    list2.add("Anna")
    list2.add("1dnna")
    list2.add("2dnna")
    list2.add("Zanna")
    println(list2)



    var listStudent  = TreeSet<Student>(Comparator { o1, o2 -> o2.age - o1.age  })
    listStudent.add(Student("Jimmi",21))
    listStudent.add(Student("Bynnyy",18))
    listStudent.add(Student("Anna",17))
    listStudent.add(Student("Anna",24))

    for (student in listStudent) {
        println(student.name + " " + student.age)
    }

}