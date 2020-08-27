package control_flow

fun main() {
    var counter = 1
    var value = 'A'
    fun ex1(){
        while (counter <= 7){
            println("Hello, World!")
            counter++
        }
    }
    ex1()
    //=======================//
    fun ex2(){
        do {
            println("Hello, World!")
            counter++
        } while (counter <= 7)
    }
    ex2()
    //=======================//
    fun ex3() {
        do {
            print(value)
        } while (value <= 'Z')
    }
    ex3()
}