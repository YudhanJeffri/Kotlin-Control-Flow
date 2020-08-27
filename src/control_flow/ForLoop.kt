package control_flow

fun main() {
    val ranges = 1..5
    val range = 1.rangeTo(5)
    val rangeStep = 1.rangeTo(10) step 3

    fun ex1() {
        for (i in ranges) {
            println("value is $i")
        }
    }
    ex1()
    fun ex2(){
        for (i in range){
            println("value is $i")
        }
    }
    ex2()
    fun ex3(){
        for (i in rangeStep){
            println("value is $i")
        }
    }
    ex3()
    fun ex4(){
        for ((index, value) in rangeStep.withIndex()){
            println("value $value with index $index")
        }
    }
    ex4()
    fun ex5(){
        rangeStep.forEach{value ->
            println("value is $value!")
        }
    }
    ex5()
    fun ex6(){
        rangeStep.forEachIndexed{index, value->
            println("value $value with index $index")
        }
    }
    ex6()
    fun ex7(){
        rangeStep.forEachIndexed { index, _ ->
            println("index $index")
        }
    }
    ex7()
}