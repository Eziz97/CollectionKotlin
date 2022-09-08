package Collection

fun main(){

    var box = Array<Int>(6,{1})
    for (i in box) {
        print("$i ")
    }
    println()
    box[0] = 10124
    box[1] = 10234
    box[2] = 10243
    box[3] = 10123
    box[4] = 1013333
    box[5] = 1013333

    for (i in box) {
        print("$i ")
    }

    println()
    var list = ArrayList<Int>()
    list.add(123)
    list.add(1234)
    list.add(12345)
    list.add(123456)
    list.add(1234567)
    println(list)

    list.remove(12345)
   //list.clear()
    println(list.contains(1223456))
    println(list)


    var vox = ArrayList<Int>()
    vox.add(777)
    vox.add(888)
    vox.add(999)
    println(vox)
    vox.addAll(list)
    println(vox)
    vox.removeAll(list)
    println(vox)
    println(vox.isEmpty())





}