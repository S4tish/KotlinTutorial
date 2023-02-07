// Kotlin variables

// Variables are containers for storing data values.

// To create a variable use var or val and assign a value to it with the equal sign(=)

// syntax
var variableName=value;
val variableName=value;

fun main(){
    var name="satish";
    val birthday=2000;

    println(name);
    println(burthday);
}

// The difference between var and val is that variables declared with the var keyword can be
// change/modified while val variables cannot

// Variable type
// Unlike many other programming languages variables in kotlin do not need to be declared
// with a specified type if you are familiar

// To create a variable in kotlin that should store text and another  that should store a number
// look at the following example

fun main(){
    var name="satish"
    val birthyear=2000;
    println(name);
    println(birthyear);
}

// kotlin is smart enough to understand that satish is a string 
// However it is possible to specify the type if you insist