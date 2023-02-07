// Kotlin Strings

// Strings are used for storing text
// A string contains a collection of charcaters surrounded by double quotes

fun main(){
    var greeting="Hello"
    println(greeting)
}

// Unlike java you do not specify that the variable should be string.Kotlin is smart enough to
// understand that the greeting variable in the example above is a String because of the double 
// quotes


// Access String
// To access the character of a string you must refer to the index number inside square brackets

// String indexes start with 0 in the example below 

fun main(){
    var txt="Hello World!"
    println(txt[0])  // first element character
    println(txt[2])  // third element character
}

// String Length
// A string in kotlin is an object which contain properties and functions that can perform
// certain operations on strings by writing a dot character (.) after the specific string variable
// For example the length of a string can be found with the length property

fun main(){
    var txt="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(" The length of the txt string is: " + txt.length);
}


// String Functions
// There are many string function available for example toUpperCase() to toLowerCase():

fun main(){
    var txt="Hello World!"
    println(txt.toUpperCase())
    println(txt.toLowerCase())
}

// Comparing Strings
// The compareTo(string) function compares two strings and return 0 if both are equal

fun main(){
    var txt1="Hello World"
    var txt2="Hello World"
    println(txt1.compareTo(txt2))  // output are 0 becuase both are equal
}


// Finding a String in a String
// The indexOf() function return the index of the firts occurence of a specified text in a string

fun main(){
    var txt="Please locate where 'locate' occurs!"
    println(txt.indexOf("locate"))
}


// Quotes Inside a String
// To use quotes inside a string use single quotes(');

fun main(){
    var txt1="It is alright"
    var txt2="Thats great"
    println(txt1)
    println(txt2)
}

// String Concatenation
// The + operator can be used between string to add them together to make a new string.This is 
// called concatenation

fun main(){
    var firstName="satish"
    var lastName="singh"
    println(firstName + " " + lastName)
}
// You can also use the plus() function to concatenate two strings 

