package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions

import java.util.*


fun readIntList(scanner: Scanner): List<Int> {
    val list = mutableListOf<Int>()
    var value = scanner.nextInt()
    while (value != -1) {
        list += value
        value = scanner.nextInt()
    }
    return list
}

fun min(list: List<Int>): Int {
    var min = list.first()
    for (value in list) {
        if (value < min) min = value
    }
    return min
}

fun max(list: List<Int>): Int {
    var max = list.first()
    for (value in list) {
        if (value > max) max = value
    }
    return max
}

fun avg(list: List<Int>): Double {
    return sum(list).toDouble() / list.size
}

fun sum(list: List<Int>): Int {
    var sum = 0
    for (value in list) sum += value
    return sum
}


fun secondElement(list: List<Int>): Int {
    return list[1]
}

