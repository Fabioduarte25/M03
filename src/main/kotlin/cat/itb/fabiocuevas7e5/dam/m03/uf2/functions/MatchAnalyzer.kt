package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions

import java.util.*





fun main() {
    val scanner = Scanner(System.`in`)

    var equip1 = llegirEquip(scanner)
    var equip2 = llegirEquip(scanner)
    var marcador = Marcador(0, 0)
    while (marcador.exit != false) {

        var tipuCistellaManresa = equip1.actualitzarPuntuacio(marcador.value1)
        var tipuCistellaJoventut = equip2.actualitzarPuntuacio(marcador.value2)
        if (tipuCistellaJoventut > tipuCistellaManresa) imprimirValors(equip2, tipuCistellaJoventut)
        else imprimirValors(equip2, tipuCistellaJoventut)
        var marcador = llegirMarcador(scanner)
    }
    var guanyador=calcularGuanyador(equip1,equip2)
    println ("Guanya $guanyador")
}

fun calcularGuanyador(equip1: Equip, equip2: Equip): String {
    return  if (equip1.puntuacio > equip2.puntuacio) equip1.nom else equip2.nom
}
