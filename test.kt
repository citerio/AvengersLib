/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


    
fun main() {
	
    //val result = calculateSerie1(10, 4)
    val result = calculateSerie2(1341)
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

fun calculateSerie2(x: Int): Int{
    
    //root
    var i = x 
    var sum = 1
    var root = 1
    var n = 1
    //var times = 2
    //sum 1
    //n 2
    //root 1
    //i 2
    
    while(i > 0){
        
        root = (2 * n) - 1
        sum = sum + root
        n++
        i--
    }
    
    return sum
    
}
