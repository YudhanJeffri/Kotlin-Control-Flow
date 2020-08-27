package control_flow

import kotlin.random.Random

fun main() {
    val value = 7
    val ranges = 10..50
    val valueRanges = 27
    val anyType : Any = 100L

    //=======================//
    fun ex1() {
        when (value) {
            6 -> println("value is 6")
            7 -> println("value is 7")
            8 -> println("value is 8")
        }
    }
    ex1()
    //=======================//
    fun ex2() {
        when (value) {
            6 -> println("value is 6")
            7 -> println("value is 7")
            8 -> println("value is 8")
            else -> println("value cannot be reached")
        }
    }
    ex2()
    //=======================//
    fun ex3(){
        val stringOfValue = when(value){
            6 -> "value is 6"
            7 -> "value is 7"
            8 -> "value is 8"
            else -> "value cannot be reached"
        }
        println(stringOfValue)
    }
    ex3()
    //=======================//
    fun ex4(){
        val stringOfValue = when(value){
            6 -> {
                println("Six")
                "value is 6"
            }

            7 -> {
                println("Seven")
                "value is 7"
            }

            8 -> {
                println("Eight")
                "value is 8"
            }
            else -> {
                println("undefined")
                "value cannot be reached"
            }
        }
        println(stringOfValue)
    }
    ex4()
    //=======================//
    fun ex5(){
        when(anyType){
            is Long -> println("the value has a Long type")
            is String -> println("the value has String type")
            else -> println("undefined")
        }
    }
    ex5()
    //=======================//
    fun ex6(){
        when(valueRanges){
            in ranges -> println("value is in the range")
            !in ranges -> println("value is outside the range")
            else -> println("value underfined")
        }
    }
    ex6()

    //=======================//
    fun getRegisterNumber() = Random.nextInt(100)
    fun ex7(){
        val registerNuber = when(val regis = getRegisterNumber()){
            in 1..50 -> 50 * regis
            in 51..100 -> 100 * regis
            else -> regis
        }
        println(registerNuber)
    }
    ex7()
    //=======================//
    fun ex8(){
        if (anyType is Long){
            println("the value has a Long type")
        } else {
            println("the value is not Long type")
        }
    }
    ex8()
    fun ex9(){
        when(anyType){
            is Long -> println("the value has a Long type")
            is Int -> println("the value has a Int type")
            is Double -> println("the value has a Dobule type")
            else -> println("undefined")
        }
    }
    ex9()
}