package onkasem.sutiwat.lab9

class Spice (val name: String, val spiciness: String = "mild"){
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                else -> 10
            }
        }
    init {
        println("spicie ${this.name} has spicy level as ${this.spiciness}")
    }

}

fun getSpicyOrLess(list: List<Spice>): List<Spice> {
    return list.filter {it.heat.toInt() <= 5 }
}

fun makeSalt(name: String = "spice salt", spiciness: String = "mild"){
    print("${name} has spicy level as ${spiciness}")
}
fun main(args: Array<String>){
    var spicies = listOf(Spice("green curry"),
        Spice("red curry, ","medium")
        ,Spice("pepper","spicy")
        , Spice("red pepper","very spicy")
    )
    val spiciness2 = getSpicyOrLess(spicies)

    println("=== Printing only spicy or less then spicy ===")
    for (s2 in spiciness2)
        println("${s2.name} has spicy level as ${s2.spiciness}")

    println("=== Make Salt ===")
    makeSalt()
}



