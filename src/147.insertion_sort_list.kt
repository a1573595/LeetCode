import other.ListNode

fun main() {
    println(insertionSortList(ListNode(4).apply {
        next = ListNode(2).apply { next = ListNode(1).apply { next = ListNode(3) } }
    }))
    println(insertionSortList(ListNode(-1).apply {
        next = ListNode(5).apply {
            next = ListNode(3).apply { next = ListNode(4).apply { next = ListNode(0) } }
        }
    }))
}

fun insertionSortList(head: ListNode?): ListNode? {
    val newHead = ListNode(0)
    var currentNode = head
    var indexNode: ListNode?
    var temp: ListNode?

    while (currentNode != null) {
        indexNode = newHead
        while (indexNode?.next != null && indexNode.next!!.`val` < currentNode.`val`) {
            indexNode = indexNode.next
        }

        temp = currentNode.next
        currentNode.next = indexNode?.next
        indexNode?.next = currentNode
        currentNode = temp
    }

    return newHead.next
}