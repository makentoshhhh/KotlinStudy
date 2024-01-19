fun main() {
    val z:Int = readLine()!!.toInt()
    val y:String = readLine()!!
    val x:Int = readLine()!!.toInt()
    if (y == "+"){
        val zx:Int = z + x
        println(zx)
    }
    if (y == "-"){
        val zx:Int = z - x
        println(zx)
    }
    if (y == "*"){
        val zx:Int = z * x
        println(zx)
    }
    if (y == "/"){
        val zx:Float = z.toFloat() / x
        println(zx)
    }


}
