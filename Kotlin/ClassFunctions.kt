// Kotlin Class Functions

class Car(var brand: String,var model:String,var year:Int){

    // class Function
    fun drive(){
        println("Wroom!")
    }
}

fun main(){
    val c1=Car("Ford","Mystang",1969)

    // print property values
    println(c1.brand + " " + c1.model + " " + c1.year)

    // call the function
    c1.drive()
}