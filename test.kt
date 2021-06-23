/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


    
fun main() {
	
    val result = calculateSerie1(10, 4)
    println("Result $result")
    
}

fun calculateSerie1(x: Int, y: Int): Int{
    
    var i = y - 1
    var sum = x
    var times = 2
    //sum 72
    //times 5
    //i 1
    
    while(i > 0){
        sum = sum * times
        times++
        i--
    }
    
    return sum
    
}
