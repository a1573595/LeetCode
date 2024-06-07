import other.ListNode

fun main() {
    println(
        reverseBetween(
            ListNode(1).apply {
                next =
                    ListNode(2).apply {
                        next =
                            ListNode(3).apply {
                                next =
                                    ListNode(4).apply {
                                        next =
                                            ListNode(5)
                                    }
                            }
                    }
            },
            2,
            4
        )
    )
    println(
        reverseBetween(
            ListNode(1).apply {
                next =
                    ListNode(2).apply {
                        next =
                            ListNode(3).apply {
                                next =
                                    ListNode(4).apply {
                                        next =
                                            ListNode(5)
                                    }
                            }
                    }
            },
            3,
            4
        )
    )

    println(
        reverseBetween(
            ListNode(5),
            1,
            1
        )
    )

    println(
        reverseBetween(
            ListNode(3).apply {
                next =
                    ListNode(5)
            },
            1,
            2
        )
    )
}


fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    var preHead: ListNode? = null
    var reverseFoot: ListNode? = head

    for (i in 0..<left - 1) {
        preHead = reverseFoot
        reverseFoot = reverseFoot?.next
    }

    var reverseHead: ListNode? = reverseFoot
    var next: ListNode? = reverseHead?.next
    var temp: ListNode?
    reverseHead?.next = null

    for (i in left..<right) {
        temp = reverseHead
        reverseHead = next
        next = next?.next
        reverseHead?.next = temp
    }

    preHead?.next = reverseHead
    reverseFoot?.next = next

    return if (preHead != null) head else reverseHead
}