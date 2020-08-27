package control_flow

fun main() {
    val rangeChar = 'A'.rangeTo('F')
    val rangeInt = 1..10
    val rangesInt = 1..10 step 2
    val tenToOne = 10.downTo(1)
    fun ex1(){
        println(rangeInt.step)
    }
    ex1()
    fun ex2(){
        rangesInt.forEach {
            print("$it")
        }
        println(rangesInt.step)
    }
    ex2()
    fun ex3(){
        if (7 in tenToOne){
            println("value is Available")
        }
    }
    ex3()
    fun ex4(){
        if (11 !in tenToOne){
            println("No value 11 in Range")
        }
    }
    ex4()
    fun ex5(){
        rangeChar.forEach{
         println("$it")
        }
        if ('B' in rangeChar){
            println("B is Available")
        } else if ('Z' !in rangeChar){
            println("No value Z in Range")
        }
    }
    ex5()
}