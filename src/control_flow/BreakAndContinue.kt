package control_flow

fun main() {
    val listOfInt = listOf(1,2,3,null,5,null,7)
    fun ex1() {
        for (i in listOfInt) {
            println(i)
        }
    }
    ex1()
    fun ex2(){
        for (i in listOfInt){
            if (i == null) continue
            println(i)
        }
    }
    ex2()
    fun ex3(){
        for (i in listOfInt){
            if (i == null) break
            println(i)
        }
    }
    ex3()
    fun ex4(){
        loop@ for (i in 1..10){
            println("Outside Loop")
            for (j in 1..10){
                println("Inside Loop")
                if (j>5)break@loop
            }
        }
    }
    ex4()
}