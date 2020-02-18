fun main(args: Array<String>){
    fitMoreFish(8.0,listOf(2,2,2),2,true)
}
fun fitMoreFish (
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true) : Boolean
{
    var total : Double = if (hasDecorations) tankSize*0.8 else tankSize
    for (i in currentFish) total -= i
    total -=fishSize
    var calculate: Boolean = total>=0
    var resultFish: String = if (fishSize == 2) ", 2" else ""
    var resultDecoration: String = if (!hasDecorations)", hasDecorations = false" else ""
    print("The result of canAddFish(${tankSize}, listOf($currentFish$resultFish$resultDecoration) ---> $calculate")

    return true
}