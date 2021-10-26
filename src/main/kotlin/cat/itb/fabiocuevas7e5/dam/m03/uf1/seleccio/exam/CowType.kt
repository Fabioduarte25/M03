package cat.itb.fabiocuevas7e5.dam.m03.uf1.seleccio.exam

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val age = sc.nextInt()
    val sexe = sc.nextInt()
    val capat = sc.nextInt()
    if(age<2){
        println("vedell")}
    if(age >=2 && sexe==1 && capat==1) {
        println("toro")
    }
    if(age >=2 && sexe==1 && capat==2) {
        println("bou")
    }
    if(age >=2 && sexe==2){
        println("vaca")
    }
    }
