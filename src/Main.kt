import java.lang.IllegalArgumentException
import kotlin.math.abs
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor

class drobi(
    private val x: Int,
    private val y: Int

){
    fun sum(other: drobi): drobi{
        val x = this.x * other.y + other.x * this.y
        val y = this.y * other.y
        return drobi(x,y)

    }
    fun umn(other: drobi): drobi {
        val x = this.x * other.x
        val y = this.y * other.y
        return drobi(x,y)
    }
    fun minus(other: drobi): drobi =
        sum(drobi(-other.x, other.y))

    fun delenie(x: Int, y: Int) : drobi{

    }