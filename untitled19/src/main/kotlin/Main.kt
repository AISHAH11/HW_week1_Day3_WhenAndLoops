package filesio
import java.io.File

fun main() {

    var f=File("student.txt")
    var fwiter=File("student_copy.txt")
    f.forEachLine { line ->
        fwiter.appendText(line + "\n")
    }
}
