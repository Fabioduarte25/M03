package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val cases = readDailyCasesFromScanner(scanner)
    val totalcases = countTotalCases(cases)
    val growthRates = growthRates(cases)
    val lastGrowthRate = growthRates.last()
    val averageGrowth = growthRates.average()
    println("Hi ha hagut $totalcases casos en total.")
    println("L'útlim creixement és de $lastGrowthRate")
    println("La mitjana de creixement és de $averageGrowth")

}
