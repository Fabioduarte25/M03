package cat.itb.fabiocuevas7e5.dam.m03.uf1.generalexam

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val list = MutableList(50){sc.nextInt()}
    var equipo1 = mutableListOf(0)
    for(i in list){
        if(list[i] % 10 == 0){
            equipo1.add(i)
        }
    }
}