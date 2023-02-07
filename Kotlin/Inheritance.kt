// Kotlin Inheritance

// In kotlin it is possible to inherit class properties and functions from one class to another

// 1 subclass - the class that inherits from another clas
// 2 supercalss - the class being inherited from 

// superclass
open class MyParentClass{
    cal x=5
}

// subclass
class MyChildClass: MyParentClass(){
    fun myFunction(){
        println(x) // x is defined in the superclass
    }
}

// Create an object of the MyChildClass and call myFunction
fun main(){
    val myObj=MyChildClass()
    myObj.myFunction()
}