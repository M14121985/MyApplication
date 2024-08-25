package com.example.myapplication
fun main(){
val mapaCoches= mapOf(
    "Audi R8" to "Audi",
    "Audi A3" to "Audi",
    "Audi A4" to "Audi",
    "Audi A5" to "Audi",
    "Audi A6" to "Audi",
    "Audi A7" to "Audi",
    "Audi A8" to "Audi",
    "Audi RS3" to "Audi",
    "Audi RS4" to "Audi",
    "Audi RS5" to "Audi",
    "Audi RS6" to "Audi",
    "Audi RS7" to "Audi",
    "Audi RS8" to "Audi",
    "Audi TTS" to "Audi",

)

val cochesDeLujo = mapaCoches.filter{i->i.value=="Audi"}
println(cochesDeLujo)

    data class Persona(val nombre:String, val edad:Int)

    val personas =listOf(

        Persona("Juan", 25),
        Persona("Ana", 30),
        Persona("Pedro", 35),
        Persona("Maria", 40),
        Persona("Luis", 45),
        Persona("Sofia", 50),
        Persona("Carlos", 55),
        Persona("Laura", 60),
        Persona("Miguel", 65),
        Persona("Elena", 70),
        Persona("Jose", 75),
        Persona("Carmen", 80),
        Persona("David", 85),
        Persona("Isabel", 90),
        Persona("Pablo", 95),
        Persona("Marta", 100),
        Persona("Jorge", 105),
        Persona("Raquel", 110),
        Persona("Javier", 115),
        Persona("Alicia", 120),

    )


    println(personas)

    val personaMayores40=personas.filter{i->i.edad>40}
    println(personaMayores40)



    val lista = listOf("hello world", "kotlin is fun", "programming is cool",

        "I love programming", "hello world", "kotlin is fun", "programming is cool",

        "I love programming", "hello world", "kotlin is fun", "programming is cool",

        "I love programming", "hello world", "kotlin is fun", "programming is cool",)


    val listasPalabras=lista.map{it.split(" ")}
    println(listasPalabras)
    val listaPalabras2=lista.map{i->i.split(" ")}
    println(listaPalabras2)

    fun sumar(a:Int, b:Int):Int =a+b
    println(sumar(500000000, 5))



    // Solicita el número a
    println("Ingresa el número a:")
    val a = readln().toInt()

    // Solicita el número b
    println("Ingresa el número b:")
    val b = readln().toInt()

    // Función lambda para multiplicar dos números
    val multiplicar: (Int, Int) -> Int = { x, y -> x * y }

    // Función lambda para sumar dos números
    val sumar: (Int, Int) -> Int = { x, y -> x + y }

    // Muestra el resultado de la multiplicación
    println("El resultado de multiplicar es: ${multiplicar(a, b)}")

    // Muestra el resultado de la suma
    println("El resultado de sumar es: ${sumar(a, b)}")

}