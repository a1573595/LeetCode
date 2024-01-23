fun main() {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
}

fun lengthOfLastWord(s: String): Int {
    var count = 0;
    
    for(i in s.length-1 downTo 0) {
        
        if(s[i].compareTo(' ')==0 && count!=0){
            break;
        } else if(s[i].compareTo(' ')!=0) {
            count++;
        }
    }

    return count;
}