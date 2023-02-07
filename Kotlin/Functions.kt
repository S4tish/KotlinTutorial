// Kotlin Function

// A function is a block of code which inly runs when it is called
// You can pass data known as parameters inti a function
// Function are used to perform certain actions and they are also known as methods

// Predefined Functions
// So it runs out you already know what a function is.You have been using it the whole time through
// this tutorial

fun main(){
    println("Hello World!")
}

// Create Your own functions
// To create your own function use the fun keyword and write the name of the function followed by
// parantheses()

fun myFunction(){
    println(" I just got executed")
}

// call a Function
// Now that you have the created a function you can execute it by calling it

// To call a function wtite the name of the function followed by two paranthese()

fun myFunction(){
    println(" I just got executed")
}
fun main(){
    myFunction()
}

// A function can be called multiple times 


// Function Parameters 
// Information can be passsed to function as parameter

fun myFunction(fname: String){
    println(fname + "Doe")
}

fun main(){
    myFunction("john")
    myFunction("Jane")
    myFunction("Rahul")
}

// When a parameter is passed to the function it is called an argument.So from the example
// fname is a parameter while John,jane and George  are arguments


// Multiple parameters
// You can have as many parameters as you like

fun myFunction(fname: String, age:Int){
    println(fname + " is " + age)
}
fun main(){
    myFunction("john",35)
    myFunction("satish",32)
    myFunction("George",15 )
}


// Return values
// In the example above we used function to output a value.In  the following example we will
// use a function and assign it to a variable 

// To return a value us ethe return keyword and specify the reurn type after the function
// parentheses

fun myfunction(x:Int): Int{
    return (x+5)
}
fun main(){
    var result=myFunction(3)
    println(result)
}

// Shorter Syntax for Return Values
// There is also syntax for returning values.You can use the = operator instead of return without
// specifying the return type.Kotlin is smart enough to automatically find out what it is

fun myFunction(x: Int, y: Int)=x+y

fun main(){
    var result=myFunction(3,5)
    println(result)
}