import java.time.LocalDateTime

fun main (){
    var d=LocalDateTime.now()
    println("the time is"+ d.hour+ ":"+d.minute+":"+d.second)
}