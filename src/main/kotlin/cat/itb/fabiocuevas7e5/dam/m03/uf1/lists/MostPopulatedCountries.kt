package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*
import kotlin.math.min

data class Country( var name: String, var population:Int)

fun main(){
    val scanner = Scanner(System.`in`)
    var inputValue = scanner.nextInt()
    val countries = mutableListOf<Country>()
    repeat(inputValue){
        var country = Country(scanner.nextLine(), scanner.nextLine().toInt())
        countries.add(country)
    }
    var minCountryPopulation = Country("", 0)
    for (country in countries){
        if(country.population < minCountryPopulation.population){
            minCountryPopulation = country
        }
    }
    for (i in 1..countries.lastIndex){
        if(countries[i].population < minCountryPopulation.population){
        }
    }
}