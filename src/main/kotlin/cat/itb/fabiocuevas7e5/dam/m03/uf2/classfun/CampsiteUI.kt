package cat.itb.fabiocuevas7e5.dam.m03.uf2.classfun

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val campSite = CampSite()
    var operation = scanner.next()
    while(operation!="END"){
        when(operation){
            "ENTRA" -> clientCheckIn(scanner, campSite)
            "MARXA" -> clientCheckOut(scanner, campSite)
        }
        printCurrentData(campSite)
        operation = scanner.next()
    }
}




fun printCurrentData(campSite: CampSite) {
    println("parcel·les: ${campSite.slots}")
    println("persones: ${campSite.personAmount}")
}


fun clientCheckOut(scanner: Scanner, campSite: CampSite) {
    var person = scanner.nextLine()
    campSite.checkOut(person)
}

fun clientCheckIn(scanner: Scanner, campSite: CampSite) {
    var persones = scanner.nextInt()
    var nom = scanner.nextLine()

    campSite.checkIn(nom, persones)
}
