package control_flow

fun main() {
    val objc = color2()
    objc.here()

    val myclr3 = color3()
    myclr3.myclr()

    val variable2 = variable()
    variable2.printvariable()

    val c1 = arraycolor()
    c1.apa()

    val c2 = valueof()
    c2.printvalueof()

    val c3 = enumArray()
    c3.colors()

    val c4 = positionColor()
    c4.printwhich()

    val c5 = whencolor()
    c5.whencolorstate()

}
class variable{
    val colorRed = color.RED
    val colorGreen = color.GREEN
    val colorBlue = color.BLUE
    fun printvariable(){
        println(colorRed)
        println(colorGreen)
        println(colorBlue)
    }
}
enum class color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
class color2{
    val colorrr: Array<colorr> = colorr.values()
    fun here(){
        print(colorrr)
    }
}
enum class colorr{
    RED, GREEN, BLUE
}
class color3{
    val colour: Array<mycolor> = mycolor.values()
    fun myclr(){
        print(colour)
    }
}
enum class mycolor(val value: Int){
    RED(0xFF0000){
        override fun privateValue(){
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun privateValue(){
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun privateValue(){
            println("value of BLUE is $value")
        }
    };
    abstract fun privateValue()
}
class arraycolor{
    val colors: Array<color> = color.values()
    fun apa(){
        colors.forEach { color ->
            print(color)
        }
    }
}
class valueof{
    val valueeofL :color = color.valueOf("RED")
    fun printvalueof(){
        println(valueeofL)
    }
}
class enumArray{
    val color: Array<color> = enumValues()
    fun colors(){
        color.forEach { colorss ->
            println(colorss)
        }
        val colors: color = enumValueOf("RED")
        print("Color is $colors")
    }
}
class positionColor{
    val which: color = color.GREEN
    fun printwhich(){
        println("Position GREEN is ${which.ordinal}")
    }
}
class whencolor{
    val color1: color = color.GREEN
    fun whencolorstate(){
        when(color1){
            color.RED -> println("Color is RED")
            color.BLUE -> println("Color is Blue")
            color.GREEN -> println("Color is Green")
        }
    }

}