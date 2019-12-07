package easy

// https://leetcode.com/problems/length-of-last-word/

fun main(args: Array<String>) {
    println(lengthOfLastWord("Hello World"))    // 5
    println(lengthOfLastWord("Today is a nice day"))  // 3
    println(lengthOfLastWord("a "))  // 1
    println(lengthOfLastWord("  "))  // 0

    println(lengthOfLastWord2("Hello World"))    // 5
    println(lengthOfLastWord2("Today is a nice day"))  // 3
    println(lengthOfLastWord2("a "))  // 1
    println(lengthOfLastWord2("  "))  // 0
}

fun lengthOfLastWord(str: String): Int {
    if(str.isEmpty()) return 0

    val array = str.split(" ")

    for(i in array.size-1 downTo 0) {
        if(array[i].isNotEmpty() && array[i].isNotBlank()) {
            return array[i].length
        }
    }

    return 0
}

fun lengthOfLastWord2(str: String): Int {
    if(str.isEmpty()) return 0
    var count = 0

    for(i in str.length-1 downTo 0) {
        if(count == 0 && str[i]==' ') {
            continue
        } else if(count > 0 && str[i]==' '){
            break
        } else if(str[i]!=' ') {
            count++
        }
    }

    return count
}