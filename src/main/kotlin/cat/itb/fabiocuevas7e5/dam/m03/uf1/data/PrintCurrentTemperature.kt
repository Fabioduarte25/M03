package cat.itb.fabiocuevas7e5.dam.m03.uf1.data

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Dime la temperatura  en Fahrenheit :")
    val fahrenheit = scanner.nextDouble()

    val celsius =( (fahrenheit  -  32  ) *  5)/9

    println("La temperatura actual és   ($fahrenheit) Fahrenheit = Celsius ($celsius)")
}