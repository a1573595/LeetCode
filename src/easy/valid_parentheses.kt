package easy

import java.util.*
import kotlin.collections.ArrayList

// https://leetcode.com/problems/valid-parentheses/

fun main(args: Array<String>) {
    println(isValid("()"))
    println(isValid("()[]{}"))
    println(isValid("(]"))
    println(isValid("([)]"))
    println(isValid("{[]}"))

    println()
    println()

    println(isValid2("()"))
    println(isValid2("()[]{}"))
    println(isValid2("(]"))
    println(isValid2("([)]"))
    println(isValid2("{[]}"))
}

fun isValid(str: String): Boolean {
    val charList = ArrayList<Char>()

    for(c in str){
        if(charList.size >= 0 && (c == '(' || c == '{' || c == '[')) {
            charList.add(c)
        } else if(charList.size > 0 && (c == ')' && charList[charList.size-1] == '(' ||
                    c == '}' && charList[charList.size-1] == '{' ||
                    c == ']' && charList[charList.size-1] == '[')){
            charList.removeAt(charList.size-1)
        } else
            return false
    }

    return charList.size == 0
}

fun isValid2(str: String): Boolean {
    var str2 = str

    while(str2.contains("()") || str2.contains("[]") || str2.contains("{}")) {
        str2 = str2.replace("()","").replace("[]","").replace("{}","")
    }

    return str2.isEmpty()
}


class Solution {
    // Hash table that takes care of the mappings.
    private val mappings: HashMap<Char, Char> = HashMap()

    // Initialize hash map with mappings. This simply makes the code easier to read.
    init {
        mappings[')'] = '('
        mappings['}'] = '{'
        mappings[']'] = '['
    }

    fun isValid(s: String): Boolean { // Initialize a stack to be used in the algorithm.
        val stack = Stack<Char>()
        for (element in s) {
            val c = element
            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) { // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                val topElement = if (stack.empty()) '#' else stack.pop()
                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings[c]) {
                    return false
                }
            } else { // If it was an opening bracket, push to the stack.
                stack.push(c)
            }
        }
        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty()
    }
}