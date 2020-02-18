fun main(args: Array<String>){
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        print("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}
fun getBirthday(): Int {
    print("Enter your birthday : ")
    val birthday = readLine()!!.toIntOrNull() ?: 35
    return birthday
}

fun getFortune(birthday: Int): String {

    val Message = listOf("You will have a great day!",
        "Things will go well for you to day",
        "Enjoy a wonderful day of success",
        "Be humble and all will turn out well",
        "Today is good day for exercising restraint",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune")

    val check = birthday%Message.size
    return when(birthday){
        28,31 -> "Enjoy that last days of mouth \n"
        in 1..7 -> "Have a good start the first week of month \n"
        in 1..31 -> "${Message[check]} \n"
        else -> "Please enter a valid birthday (1-31) \n"
    }
}