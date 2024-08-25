fun main(){
    println(suma)
    println(sumarNumeross(numeros))
    println(sumarNumeross(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10000000)))
    recorerLista(nombres)
    recorrerLista2(nombres)







}



var numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
var suma=numeros.reduce{acumulador, valorActual -> acumulador+valorActual}

fun sumarNumeross(numeros:List<Int>):Int {
    var total = 0
    for(i in numeros) {
        total += i
    }
    return total
}
val nombres = mutableListOf(
    "Juan", "Ana", "Pedro", "Maria",
    "Luis", "Sofia", "Carlos","Laura",
    "Miguel", "Elena", "Jose", "Carmen",
    "David", "Isabel", "Pablo", "Marta",
    "Jorge", "Raquel", "Javier", "Alicia"
)
fun recorerLista(nombres:List<String>){
    for(i in nombres.indices){
        println("indice $i: ${nombres[i]}")
    }

}
//con forEach
fun recorrerLista2(nombres: List<String>) {

    nombres.forEachIndexed { index, nombre ->
        println("indice $index: $nombre")
    }
}