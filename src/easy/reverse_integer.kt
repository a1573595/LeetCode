package easy

// https://leetcode.com/problems/reverse-integer/

fun main(args: Array<String>) {
    println(reverse(123))
    println(reverse(-123))
    println(reverse(120))

    println(reverse(1534236469))

    println(Integer.toBinaryString(1534236469).length)
}

fun reverse(x: Int): Int {
    var y: Int = if(x<0) -x else x
    var z: Long = 0

    while(y > 0) {
        z = z * 10 + y % 10
        y /= 10
    }

    return if(z > Int.MAX_VALUE ||  z < Int.MIN_VALUE) 0 else if(x<0) -z.toInt() else z.toInt()
}