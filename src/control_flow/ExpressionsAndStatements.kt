package control_flow

fun main() {
    val value3 = 10
    val value4 = 10
    val openOffice = 7
    val now = 8
    val office = if (now > openOffice) "Office already open" else "office close"
    println(office)
    sum(1,1*4)
    sum2(value3,value4)
}
fun sum(value1: Int, value2: Int) = value1+value2
fun sum2(value3: Int, value4: Int) = value3+value4