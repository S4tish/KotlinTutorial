// Kotlin when

// Instead of writing many if else expressions you can use the when expression which is much easier
// to read

fun main(){
    val day=4

    val result=when (day){
        1 ->"Monday"
        2 -> "Tuesday"
        3 ->"Wednesday"
        4 ->"Thursday"
        5 ->"Friday"
        6 -> "saturday"
        7 -> "sunday"
        else -> "Invalid day"
    }
    println(result)
}