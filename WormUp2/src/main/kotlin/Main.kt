//======================================================================================================================
// Part 1
//======================================================================================================================
class Book(bname : String, author : String, published : Int, lang : String, pages : Int) {

    var bookName: String;
    var _author: String;
    var publish: Int;
    var language: String;
    var page: Int;
    init{
        bookName = bname
        _author = author.uppercase()
        publish = published
        language = lang
        page = pages
    }
    fun addbookmark(pagenumber: Int, bookMarkNote: String): MutableMap<Int, String> {
        var map = mutableMapOf<Int, String>()
        if (pagenumber >= 0 && pagenumber <= page) {
            map.put(pagenumber, bookMarkNote)
            println("Your book mark: ")
            for ((pagenumber, bookMarkNote) in map) {
                println("$pagenumber , in page: $bookMarkNote")
            }
        } else {
            println("Please enter a page number in the book limit")
        }
        return map
    }
//    fun display(_map: MutableMap<String, Int>) {
//        println("your book mark: ")
//        for ((i, j) in _map) {
//            println("$i , in page: $j")
//        }
//    }
    fun bookDetails() {
            println("Book name is: $bookName")
            println("Author is: $_author")
            println("Published: $publish")
            println("language: $language")
            println("number of pages: $page")
    }
}
//======================================================================================================================
// Part 2
//======================================================================================================================
//??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
//Properties:
//Current page
//Member functions:
//To turn the page to right.
//To turn the page to left.
//??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
//======================================================================================================================
fun main(args: Array<String>) {
    var b = Book("1984","goerge",1830,"English",230)
    b.addbookmark(1,"This book is really interesting")
    b.addbookmark(230,"never mind")
    b.addbookmark(330,"could work ?")

    b.bookDetails()
}