package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions

import java.util.*

fun llegirMarcador(scanner: Scanner): Marcador {
    var marcador:Marcador
    var value1 = scanner.nextInt()
    if (value1 == -1){
        marcador = Marcador(0,0)
        marcador.exit = true
    } else {
        var value2 = scanner.nextInt()
        marcador = Marcador(value1,value2)
    }
    return marcador
}

fun llegirEquip(scanner: Scanner): Equip {
    var name = scanner.nextLine()
    return Equip(name)
}


fun imprimirValors(equip: Equip, tipuCistellaManresa: Int) {
    var comentari = when (tipuCistellaManresa) {
        1 -> "Tir lliure"
        2 -> "Cistella"
        else -> "Triple"

    }
    comentari = comentari+" de"+equip.nom
    println(comentari)
}
