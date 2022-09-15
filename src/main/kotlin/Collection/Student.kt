package Collection

class Student(var name:String,var age:Int) : Comparable<Student>{

    override fun compareTo(other: Student): Int {
        if (this.name == other.name){
            return  this.age - other.age
        }
      return  this.name.compareTo(other.name)
    }
}