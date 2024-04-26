package other

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun ListNode.printList() {
    var root: ListNode? = this

    while (root != null) {
        print("${root.`val`} -> ")
        root = root.next
    }

    println("")
}