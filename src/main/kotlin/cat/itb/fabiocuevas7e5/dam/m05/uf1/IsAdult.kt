package cat.itb.fabiocuevas7e5.dam.m05.uf1

fun main(){

    if(!isAdult(2018, 10, 17, 1985, 1, 1)) {
        println("Ha fallat: isAdult(2018, 10, 17, 1985, 1, 1)")
    }
    if(isAdult(2018, 10, 17, 2015, 1, 1)){
        println("Ha fallat isAdult(2018, 10, 17, 2015, 1, 1))")
    }
    if(!isAdult(2018, 10, 17, 2000, 1, 1)) {
        println("Ha fallat: isAdult(2018, 10, 17, 2000, 1, 1)")
    }
    if(isAdult(2018, 10, 17, 2000, 12, 1)){
        println("Ha fallat isAdult(2018, 10, 17, 2000, 12, 1))")
    }
    if(!isAdult(2018, 10, 17, 2000, 10, 1)) {
        println("Ha fallat: isAdult(2018, 10, 17, 2000, 10, 1)")
    }
    if(!isAdult(2018, 10, 17, 2000, 10, 17)) {
        println("Ha fallat: isAdult(2018, 10, 17, 2000, 10, 17)")

    }
    if(isAdult(2018, 10, 17, 2000, 10, 30)){
        println("Ha fallat isAdult(2018, 10, 17, 2000, 10, 30))")
    }
}
fun isAdult(
    todayYear: Int,
    todayMonth: Int,
    todayDay: Int,
    birthYear: Int,
    birthMonth: Int,
    birthDay: Int
): Boolean {
    val isAdult = todayYear > birthYear + 18
    val isDifficultYear = todayYear == birthYear + 18
    val isAdultForMonth = isDifficultYear && todayMonth >= birthMonth
    val isDifficultMonth = isDifficultYear && todayMonth == birthMonth
    val isAdultForDay = isDifficultMonth && todayDay > birthDay
    return isAdult || isAdultForMonth || isAdultForDay
}