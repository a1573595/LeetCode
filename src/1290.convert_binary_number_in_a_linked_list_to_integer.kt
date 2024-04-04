import other.ListNode

fun main() {
    println(getDecimalValue2(ListNode(1).apply {
        this.next = ListNode(0).apply {
            this.next = ListNode(1)
        }
    }))
    println(getDecimalValue2(ListNode(0)))
}

fun getDecimalValue(head: ListNode?): Int {
    val builder = StringBuilder()

    var node = head;
    while (node != null) {
        builder.append(node.`val`)
        node = node.next
    }

    return builder.toString().toBigInteger(2).intValueExact()
}

fun getDecimalValue2(head: ListNode?): Int {
    var count = 0

    var node = head
    while (node != null) {
        count = count.shl(1)
        if (node.`val` > 0) {
            count++;
        }

        node = node.next
    }

    return count
}