// Kotlin Break and Continue

// Kotlin Break
// The break statement is used to jump out of a loop

fun main(){
    var i=0
    while(i<10){
        println(i)
        i++
        if(i==4){
            break
        }
    }
}


// Kotlin Continue
// The continue statement breaks one itertaion if a specified condition occurs and continues with
// the next iteration in the loop

var i=0;
while(i<10){
    if(i==4){
        i++
        continue
    }
    println(i)
    i++
}