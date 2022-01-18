import kotlin.text.* //Import text package
fun main() { // Define function
    print("How are you today? ") //Ask the question

    val x = readLine()!! // Store answer in variable
    when { // Check the answer
    "good" in x -> println("I'm glad to hear that!") // Reply
    "bad" in x -> println("Oh no D:") //Reply
}
    println("You entered: $x")
}
