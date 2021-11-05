package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val letras = sc.nextInt()
    var vocales : String
    for(i in 1..letras){
        val vocales = sc.next()
        if( vocales == "a" || vocales == "e" || vocales == "i" || vocales == "o" || vocales == "u"){
            print("$vocales ")
        }
    }
}
/*
val times = sc.nextInt()
var letter:Char
repeat(times){
letter = sc.next().single()
when (letter){
'a', 'e', 'i', 'o', 'u' -> print ("$letter")
 */