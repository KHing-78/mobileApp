import java.util.*;

fun main(args: Array<String>){
    getFortuneCooking()
}
fun getFortuneCooking(): String{

    val Message = listOf("You will have a great day!",
        "Things will go well for you to day",
        "Enjoy a wonderful day of success",
        "Be humble and all will turn out well",
        "Today is good day for exercising restraint",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune")



    print("Enter your birthday : ")
    val birthday = readLine()!!.toIntOrNull() ?: 35
    val check = birthday%Message.size

    return when(birthday) {
        in 1..31 -> print("Your fortune is: ${Message[check]}").toString()
        else -> print("Please enter your birthday").toString()
    }
}