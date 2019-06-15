import kotlin.math.pow

fun main(args:Array<String>) {
    val array =  Array(6){1000.0.pow(10)}
    val units = arrayOf("byte","KB","MB","GB","TB","PB")
    for((i,value) in array.withIndex()){
        println("1 ${units[i]}=${value.toLong()} bytes\n")
    }
    /*var message = "Hello and welcome to AppWorks Scol ;)"
    when(message.length){
        0 -> println("a")
        in 1..39 ->println("y")
        in 40..56 ->println("m")
        else ->println("tt")
    }*/
    //println(message.length)
    //println(message)
    //var list:List<String> = listOf("Wyne","Chen")
   /* for(a in 100 downTo 1 step 5){
        println(a)
    }*/

}




