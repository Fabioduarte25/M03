package cat.itb.fabiocuevas7e5.DAM.m03.uf1.data.project

import java.time.Year
import java.util.*

val scanner = Scanner(System.`in`).useLocale(Locale.UK)

fun welcome() {
    print("Hello! My name is TrainingAssistant")
    print("Please, tell me your name")
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    println("What a great name you have, ${name}")

}

fun ageCalculator() {
print("Please tell me which year you were born")
    val currentYear = Year.now().value
    val born = scanner.nextInt()
    val age = currentYear - born
    println("You are between {$age-1}nd {$age+1}  and  years old. That's a good age for practicing sport.")
}

fun imcCalculator() {

}
fun trainingSchedule() {
    
}