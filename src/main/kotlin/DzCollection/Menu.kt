package DzCollection

import java.util.*
import kotlin.collections.ArrayList

class Menu {

    var login = ArrayList<String>()



    fun menuGlav(){
        var scanner= Scanner(System.`in`)
        println("1 - add login")
        println("2 - list logina")
        println("3 - clear list")

        var answer = scanner.nextLine()
        when(answer){
            "1" -> {
                menuAddLogin()
                menuGlav()
            }
            "2" -> {spisok()
            menuGlav()}
            "3" -> {ocistka()
            menuGlav()}
        }
    }

    fun menuAddLogin() {
        var scanner= Scanner(System.`in`)
        println("vedite login")
        login.add(scanner.nextLine())

    }
     fun spisok(){
       println(login)
     }
    fun ocistka(){
        login.clear()//очистка
    }

}