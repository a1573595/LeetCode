package other

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        val sb = StringBuilder();
        var node = this.next
        sb.append("$`val`")

        while (node != null) {
            sb.append("->${node.`val`}")
            node = node.next
        }

        return sb.toString()
    }
}

fun ListNode.printList() {
    var root: ListNode? = this

    while (root != null) {
        print("${root.`val`} -> ")
        root = root.next
    }

    println("")
}