// Kotlin Arrays

// Arraysd are used to store multiple values in a single variables instead of creating separete 
// variables for each value

// To create an array use the arrayOf() function and place the values in a comma separated list
// inside it

val cars=arrayOf("volvo","BMW","Ford")


// Access the Elements of an array
// You can access an array element by refering to the index number inside square brackets


fun main(){
    val cars=arrayOf("volvo","Ford","Mazda")
    println(cars[0])
}

// Change the Array Element
// To change the value of a specific element refer to the index number

fun main(){
    val cars=arryOf("volvo","BMW","Ford")
    cars[0]="opel"
    println(cars[0])
}


// Array Lengthg/size
// To find the out how many element an array have use the size property

fun main(){
    val cars=arrayOf("Volvo","Ford","Mazda")
    println(cars.size)
}


// Check if an Element Exists
// You can use the in operator to check if an element exist in an array

fun main(){
    val cars=arrayOf("Volvo","Ford","Mazda")
    if("volvo" in cars){
        println("It exists")
    }else{
        println("It does nor exist")
    }
}


// Loop Through an Array
// Often when yiu work with arrays you need to loop through all the elements

// You can loop through the array elements with the for loop which you will learn more about in the 
// next chapter

fun main(){
    val cars=arrayOf("volvo","Mazda")
    for(x in cars)
    println(x)
}