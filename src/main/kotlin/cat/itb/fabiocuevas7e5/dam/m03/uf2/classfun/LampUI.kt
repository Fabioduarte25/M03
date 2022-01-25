package cat.itb.fabiocuevas7e5.dam.m03.uf2.classfun

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val lamp = Lamp()
    var action = scanner.nextLine()
    while (action != "END") {
        lamp.perform(action)
        println(lamp.turnedOn)
        action = scanner.nextLine()
    }
}

