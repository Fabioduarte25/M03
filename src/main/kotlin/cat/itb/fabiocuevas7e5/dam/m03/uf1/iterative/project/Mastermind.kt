package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative.project

import java.util.*


data class Evaluation(val rightPosition: Int, val wrongPosition: Int)
fun main() {
    val scanner = Scanner(System.`in`)
    var secret = ""
    println("Vols jugar en mode 1vs1 (1) o solitari (2)?")
    val gameMode = scanner.nextInt()


    if (gameMode ==1){
        println("Introdueix la paraula secreta")
        secret = scanner.next()
    }
    if (gameMode == 2) {
        repeat(4){
            secret = secret + randomChar()
        }
        println("Paraula secreta generada!")
        println(secret)
    }

    println("Comença el joc!")


    var turns = 0
    while(turns < 12){
        turns += 1
        println("Introdueix una combinació")
        val guess = scanner.next()
        var evaluation = evaluateWord(secret, guess)
        println(evaluation)
        if (evaluation.rightPosition == 4){
            println("Enhorabona! has guanyat")
        break}
        else if(evaluation.rightPosition !== 4 && turns == 12){
            println("Fi del joc. Has perdut!")
            break
        }
    }

}

fun randomChar():Char{
    val allowedChars = 'A'..'F'
    return allowedChars.random()
}

fun evaluateWord(secret: String, guess: String): Evaluation {
        var rightPosition = 0
        var wrongPosition = 0
        for (i in 0 until 4){
            if (guess[i] == secret[i])
                rightPosition += 1
            else if(guess[i] in secret)
                wrongPosition += 1
        }
        return Evaluation(rightPosition, wrongPosition )
    }
