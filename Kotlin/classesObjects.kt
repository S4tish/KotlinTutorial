// Kotlin Classes and Objects

// Everything in kotlin is associated with classes and objects 

// Create a class
Class Car{
    var brand= " "
    var model= " "
    var year=0
}

fun main(){
    val c1=Car()
    c1.brand="Ford"
    c1.model="Mustang"
    c1.yaer=1969

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}