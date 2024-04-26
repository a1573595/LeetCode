import other.ListNode
import other.printList

fun main() {
    val list1 = reverseList(ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }
    })

    list1?.printList()

    val list2 = reverseList(ListNode(1).apply {
        next = ListNode(2)
    })

    list2?.printList()
}

fun reverseList(head: ListNode?): ListNode? {
    val root = ListNode(0)
    var current = head

    while (current!=null) {
        val preNext = root.next
        root.next = current
        current = current.next
        root.next?.next = preNext
    }

    return root.next
}