package cat.itb.fabiocuevas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val month = sc.nextInt()
    val year = sc.nextInt()

    val days = when(month){
        1,3,5,7,8,10,12 -> 31
        4,6,9,11 -> 30
        else -> {
            if (isLeapYear(year)) {
                29
            } else {
                28
            }
        }
    }
    println(days)
}

fun isLeapYear(year: Int): Boolean {
    val lastDigits=year%100
    var isLeapYear = false
    if (lastDigits%4==0 ){
        if (year%400==0 ) isLeapYear = true
    }
    return isLeapYear
}
