import org.json.JSONObject
import java.net.URL

fun main() {
    var u =URL("https //aka.ms/accountsettings minecraft ps4")
    var text =u.readText()
    println(text)
    var obj=JSONObject(text)
    var email=obj.getString("email")
    println(email)
}
