fun main() {
    val z:Int = readLine()!!.toInt()
    val y:String = readLine()!!
    val x:Int = readLine()!!.toInt()
calculate(z,x,y)

}
fun calculate(num1:Int, num2: Int, operand: String){
    when(operand) {
        "+" -> {
            var r = num1+ num2
            print("$num1 + $num2 = ${num1 + num2}")
        }
        "-" -> print("$num1 + $num2 = ${num1 - num2}")
        "*" -> print("$num1 + $num2 = ${num1 * num2}")
        "/" -> print("$num1 + $num2 = ${num1 / num2}")
        else -> print("Введено не коректное число")
    }
}