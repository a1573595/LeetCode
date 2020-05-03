package easy

data class ListNode(var value: Int, var next: ListNode? = null)

fun produceNode(intArray: IntArray): ListNode? {
    val head: ListNode? = if (intArray.isEmpty()) null else ListNode(intArray[0])
    var node: ListNode? = head
    var index = 1

    while (index < intArray.size) {
        node?.next = ListNode(intArray[index])
        node = node?.next
        index++
    }

    return head
}

fun showNode(listNode: ListNode?) {
    var node = listNode

    while (node != null) {
        print(node.value)
        node = node.next

        if (node != null)
            print(" -> ")
    }

    println()
}