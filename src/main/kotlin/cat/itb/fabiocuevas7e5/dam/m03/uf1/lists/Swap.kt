package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val inputValues = MutableList<Int>(4){sc.nextInt()}
    val firstElement = inputValues.first()
    inputValues[0] = inputValues.last()
    inputValues[inputValues.lastIndex] = firstElement
    println(inputValues)
}