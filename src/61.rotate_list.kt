import other.ListNode

fun main() {
    println(rotateRight(ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply { next = ListNode(4).apply { next = ListNode(5) } }
        }
    }, 2))
    println(rotateRight(ListNode(0).apply { next = ListNode(1).apply { next = ListNode(2) } }, 4))
    println(rotateRight(ListNode(1), 1))
}

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head == null || k == 0) {
        return head
    }

    var size = 0
    var node: ListNode? = head
    while (node != null) {
        size++
        node = node.next
    }

    val k = k % size

    if (k == 0) {
        return head
    }

    var previous: ListNode? = null
    var newHead: ListNode? = head
    for (i in 0..<size - k) {
        previous = newHead
        newHead = newHead?.next
    }

    node = newHead
    while (node?.next != null) {
        node = node.next
    }
    node?.next = head
    previous?.next = null

    return newHead
}