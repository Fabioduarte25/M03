package cat.itb.fabiocuevas7e5.dam.m03.uf1.data

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Dime tu primer numero")
    val num1 = scanner.nextInt()

    println("Dime tu segundo numero")
    val num2 = scanner.nextInt()

    println("Dime tu tercer numero")
    val num3 = scanner.nextInt()

    println("Dime tu cuarto numero")
    val num4 = scanner.nextInt()


    println((num1 + num2) * (num3 - num4))
}