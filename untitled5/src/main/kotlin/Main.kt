fun main() {
    println(c())
}


fun c() {
    var nameday = Integer.valueOf(readLine())

    when (nameday) {
        1 -> println("sunday")
        2 -> println("monday")
        3 -> println("tuesday")
        4 -> println("wenesday")
        5 -> println("thursday")
        6 -> println("friday")
        else -> println("no day for this number")

    }
}

fun smallestnum(num1:Int,num2:Int,num3:Int) {
       when(true){
           num1<=num2 || num1<=num3-> println("smallestNum is:$num1")
           num2<=num1 || num2<=num3-> println("smallestNum is:$num2")
           else-> println("smallestnum is :$num3")


       }