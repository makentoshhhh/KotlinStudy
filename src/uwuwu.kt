fun main() {
    val z:Int = readLine()!!.toInt()
    val y:String = readLine()!!
    val x:Int = readLine()!!.toInt()
when(y){
    "+" -> { var r = z+x
        print("$z + $x = ${z+x}")
    }
    "-" -> print("$z + $x = ${z-x}")
    "*" -> print("$z + $x = ${z*x}")
    "/" -> print("$z + $x = ${z/x}")
else -> print("Введено не коректное число")
}

}
