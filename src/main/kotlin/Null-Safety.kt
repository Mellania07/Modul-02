//contoh pemberian nilai null yang diizinkan

fun main(args: Array<String>){
    //Nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}