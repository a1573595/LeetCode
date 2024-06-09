import other.ListNode

fun main() {
    println(partition(ListNode(1).apply {
        next = ListNode(4).apply {
            next = ListNode(3).apply {
                next = ListNode(2).apply {
                    next = ListNode(5).apply {
                        next = ListNode(2)
                    }
                }
            }
        }
    }, 3))

    println(partition(ListNode(2).apply {
        next = ListNode(1)
    }, 2))
}

fun partition(head: ListNode?, x: Int): ListNode? {
    val leftHead = ListNode(0)
    val rightHead = ListNode(0)
    var left = leftHead
    var right = rightHead

    var node = head
    while (node != null) {
        if (node.`val` < x) {
            left.next = node
            left = left.next!!
        } else {
            right.next = node
            right = right.next!!
        }

        node = node.next
    }

    left.next = rightHead.next
    right.next = null

    return leftHead.next
}