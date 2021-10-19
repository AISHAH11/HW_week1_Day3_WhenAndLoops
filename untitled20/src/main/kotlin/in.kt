 open class person (var name:String,var age:Int){


}
class student(name: String,age: Int,var gpa:Double):person(name,age){


}

fun main() {
    var stu=student("sam",  23,  3.2)
    println(stu.name)
}