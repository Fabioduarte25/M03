package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val numero = sc.nextInt()
    var result = 1
    for(i in 1..numero){
        result = result * i
    }
    println(result)
}
