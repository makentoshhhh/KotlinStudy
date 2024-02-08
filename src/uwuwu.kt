///fun main() {
    ///uw()

fun calculate(num1:Int, num2: Int, operand: String){
    when(operand) {
        "+" -> {
            var r = num1+ num2
            print("$num1 + $num2 = ${num1 + num2}")
        }
        "-" -> print("$num1 + $num2 = ${num1 - num2}")
        "*" -> print("$num1 * $num2 = ${num1 * num2}")
        "/" -> print("$num1 / $num2 = ${num1 / num2}")
        else -> print("Введено не коректное число")
    }
}
fun uw(){
    val z:Int = readLine()!!.toInt()
    val y:String = readLine()!!
    val x:Int = readLine()!!.toInt()
   calculate(z,x,y)
}
fun task2(){
    val m:List <Int> = listOf(1,2,3,4,5,6,7,8)
    val p:MutableList <Int> = mutableListOf(1,2,3,4,5)
    p.add(6)
    val o:Map <Int,Int> = mapOf()
    val c:HashMap <Int,Int> = hashMapOf()

}
fun poisk(){
    val a:MutableList <Int> = mutableListOf()



}
fun trichisla(){
    for (i in 100..999){
        var one = i / 100
        var three = i % 10
        var two = i / 10
        two = two % 10
        if (one != two && two != three && three != one){
            println(i)
        }
    }

}
