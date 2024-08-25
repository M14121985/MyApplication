package com.example.myapplication

fun main(){

    var lista1= mutableListOf(45,45,89,456,7,8,9,1,2,3,4,5,6,7,8,25)
    var listaOrdenada=lista1.sorted()
    println(listaOrdenada)
    println(listaOrdenada)

    //for para recorrer la lista ordenada
    for (i in listaOrdenada.indices) {
        println("$i: ${listaOrdenada[i]}")
    }

    //otra version del for
    for((i,j) in listaOrdenada.withIndex()){
        println("este metodo es con .withIndex() $i: $j")
    }

    //recorrer la lista con forEach
    listaOrdenada.forEach {
        println(it)
    }
    // listaOrdenada.forEach{i-> println(i)}
    listaOrdenada.forEach{i-> println(i)}

    // recorrer
    var i=0
    while(i<listaOrdenada.size){
        println("elemento indice $i es ${listaOrdenada[i]}")
        i++
    }

    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = mutableListOf<Int>()
    numeros.forEach { numero ->
        if (numero % 2 == 0) pares.add(numero)
    }

    println(pares)

    var lista2=lista1.add(8900)


//rango de numeros

    for(i in 0..100){
        println(i)
    }


    for(i in 0..100 step 5){
        println(i)
    }

var listaNombres=mutableListOf("juan","pedro","maria","ana", "jose", "luis", "ana")

    for(i in listaNombres){
        println(i.uppercase())
    }

    val cochesDeLujo = mutableListOf(
        "Audi R8",
        "Bentley Continental GT",
        "Ferrari 488 GTB",
        "Lamborghini Huracan",
        "Mercedes-AMG GT 63 S",
        "Porsche 911 Turbo S",
        "Rolls-Royce Phantom"
    )

    cochesDeLujo.forEach{i->println(i.uppercase())}

//con for
    for(i in cochesDeLujo.indices){
        println("coche numero $i: ${cochesDeLujo[i]}")
    }
















}