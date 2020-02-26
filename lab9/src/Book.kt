package onkasem.sutiwat.lab9

open class Book (val tile: String, val author: String ){
    protected  var currentPage = 1

    open fun readPage() {
        currentPage++
    }

    override fun toString(): String {
        return "Title: $tile Author: $author CurrentPage: $currentPage\n"
    }
}

class EBook(tile: String, author: String):Book(tile, author) {
    var defaultWord = 250
    var format = "text"

    override fun readPage() {
        super.readPage()
        defaultWord += 250
    }

    override fun toString(): String {
        return " ${super.toString()} Format: ${format}  WordCount: ${defaultWord}"

    }
}

fun main(args: Array<String>){
    var b1 = Book("Principles", "Ray Dalio")
    b1.readPage()
    println(b1)

    var eb1 = EBook("How Will You Measure Your Life", "Clayton M. Christensen")
    println(eb1)
    eb1.readPage()

    var eb2 = EBook("End of Day: Predictions and Prophecis about the End of the World",
        "Sylvia Browne")
    eb2.readPage()
    eb2.readPage()
    println(eb2)
}


