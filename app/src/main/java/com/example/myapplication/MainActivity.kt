package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        }
    }





//funcion nombre
fun greet(name: String) {
    println("Hello, $name!")
}

fun greet(name: String, age: Int) {
    println("Hello, $name! You are $age years old.")
}




/*funcion para sumar numeros un numero indeterminado de sumandos*/
fun sumar(vararg numeros:Int):Int{
    var total=0
    for(i in numeros){
        total+=i

    }
    return total
}
var resultado=sumar(1,2,3,4,5,6,7,8,9,10456)


fun sumarNumeros3(numeros: List<Int>): Int {
    var total = 0
    for (numero in numeros) {
        total += numero
    }
    return total
}




fun sumarNumeros4(vararg numeros: Int): Int {
    var total = 0
    for (numero in numeros) {
        total += numero
    }
    return total
}


fun saludar(nombre: String){
    println("hola, introduce tu nombre: ")
    println("Hola, $nombre")
}


fun main() {

println(resultado)
saludar("Juan")
println(sumarNumeros3(listOf(789, 456, 140000, 456, 789)))
println(sumarNumeros4(789, 456, 140000, 456, 7889))
greet("John")
greet("John", 30)





}
