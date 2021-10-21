package cat.itb.fabiocuevas7e5.DAM.m03.uf1.data.project

import java.time.Year
import java.util.*

val scanner = Scanner(System.`in`).useLocale(Locale.UK)
fun main() {
    welcome("TrainingAssistant") // change it as you need
    ageCalculator()
    imcCalculator()
    trainingSchedule()
}

fun welcome(s: String) {
    print("Hello! My name is TrainingAssistantPlease, tell me your name")
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    println("What a great name you have, ${name}")

}

fun ageCalculator() {
    print("Please tell me which year you were born")
    val currentYear = Year.now().value
    val born = scanner.nextInt()
    val age = currentYear - born
    println("You are between $age and ${age+1}  and  years old. That's a good age for practicing sport.")
}

fun imcCalculator() {
    print("Let's check some of your parameters\nTell me your weight in kg")
    val weight = scanner.nextInt()
    print("Tell me your height in m")
    val height = scanner.nextDouble()
    val imcheight = height*height
    val imc = weight/imcheight
    val obesity = 50
    println("Your IMC is $imc")
    println("Checking insufficient weight.... ${imc<= 20}")
    println("Checking normal weight.... ${imc >= 18.5 && imc <= 25}")
    println("Checking overweight.... ${imc >= 25 && imc <= 50}")
    println("Checking obesity....${imc>=obesity}")

}
fun trainingSchedule() {
    print("I'll tell you your training plan.\nHow many hours would you like to train?")
    val hours = scanner.nextInt()
    print("How many days can you train?")
    val days = scanner.nextInt()
    val dyy = hours%days
    val dy = hours/days
    val dyyy = hours/days%days
    println("Your sport routine could be:\n $dyyy days $dyy hours\n $dyy days $dy hours ")
    /*
    No sabía que operaciones hacer y no he podido encontrar ningún ejemplo en internet
     */
}

