// Kotlin If   Else

// Kotlin condition and If Else
// kotlin support the usual logival condition from mathematics

// 1 Less than : a<b
// 2 less tha or equal to : a<=b;
// 3 Greater than: a>b
// 4 Greater than or equal to: a>=b
// 5 Equal to : a==b
// 6 Not Equal to : a!=b

fun main(){
    if(20>18){
        println("20 is greater than 18")
    }
}


fun main(){
    val x=20;
    val y=10;
    if(x>y){
        ptintln("X is greater than y")
    }

}


// Kotlin Else
// Use else to specify a block of code to be executed if the condition is false

fun main(){
    val time=20;
    if(time<18){
        println("Good day")
    }else{
        println("Good evening")
    }
}


// Kotlin else if
// Use else if to specify a new condition if the first condition is false

fun main(){
    val time=22;
    if(time<10){
        println("Good morning")
    }else if(time<20){
        println("Good day")
    }else{
        println("Good evening")
    }
}