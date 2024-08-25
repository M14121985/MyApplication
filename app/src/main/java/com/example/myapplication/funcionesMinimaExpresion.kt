package com.example.myapplication

import kotlin.math.*

fun main() {
    fun cuadrado(numero: Int): Int = numero * numero

    println(cuadrado(5))
    println(cuadrado(10))
    println(cuadrado(15))
    fun cubo(numero: Int): Int = numero * numero * numero

    println(cubo(5))
    println(cubo(10))
    println(cubo(15))
    fun suma(a: Int, b: Int): Int = a + b

    println(suma(5, 5))
    println(suma(10, 10))
    println(suma(15, 15))

    fun resta(a: Int, b: Int): Int = a - b

    println(resta(5, 5))
    println(resta(10, 10))
    println(resta(15, 15))

    fun multiplicacion(a: Int, b: Int): Int = a * b

    println(multiplicacion(5, 5))
    println(multiplicacion(10, 10))
    println(multiplicacion(15, 15))
    fun esPar(n: Int): Boolean = n % 2 == 0

    println(esPar(5))
    println(esPar(10))
    println(esPar(15))

    fun esImpar(n: Int): Boolean = n % 2 != 0

    println(esImpar(5))
    println(esImpar(10))
    println(esImpar(15))

    fun esMayor(a:Int, b:Int):Boolean=a>b

    println(esMayor(5, 5))
    println(esMayor(10, 5))
    println(esMayor(15, 15))
    fun esMenor(a:Int, b:Int):Boolean=a<b

    println(esMenor(5, 5))
    println(esMenor(10, 5))
    println(esMenor(15, 15))
    fun numeroMasGrande(a:Int, b:Int):Int=if(a>b)a else b

    println(numeroMasGrande(5, 5))
    println(numeroMasGrande(10, 5))
    println(numeroMasGrande(15, 15))
    val numeros1 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val mumerosIncrementados=numeros1.map{n->n+1}
    println(mumerosIncrementados)
    val numerosIncrementados2=numeros1.map{it+4}
    println(numerosIncrementados2)

    val palabras= mutableListOf("hola", "mundo", "kotlin", "android")
    val palabrasMayusculas=palabras.map{p->p.uppercase()}
    println(palabrasMayusculas)

    val primeraLetra=palabras.map{it.first().uppercase()}
    println(primeraLetra)

    val ultimaLetra1=palabras.map{l->l.last().uppercase()}
    println(ultimaLetra1)
    val numeros2= listOf(1,2,3,4,5,6, null,7,8,9,10, null, null, null)
    val numerosSinNulo=numeros2.map{n->n?:0}
    println(numerosSinNulo)





}