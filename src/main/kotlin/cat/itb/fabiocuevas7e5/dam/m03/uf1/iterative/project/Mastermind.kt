package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative.project

import java.util.*

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)
fun main() {
    // Use only this scanner
    val scanner = Scanner(System.`in`)
    // Your code

    //use this function
    var evaluation = evaluateWord("ABCD", "AEEE")
}

fun randomChar():Char{
    val allowedChars = 'A'..'F'
    return allowedChars.random()
}

fun evaluateWord(secret: String, guess: String): Evaluation {
    //Calculate your right and wrong positions and change it as you need
    return Evaluation(0,0)
}
