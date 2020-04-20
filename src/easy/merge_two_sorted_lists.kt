package easy

// https://leetcode.com/problems/merge-two-sorted-lists/

fun main() {
    showNode(mergeTwoLists(produceNode(intArrayOf(1, 2, 4)), produceNode(intArrayOf(1, 3, 4)))) // 1->1->2->3->4->4
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null && l2 == null) return null

    val intList: ArrayList<Int> = ArrayList()

    var node: ListNode? = l1
    while (node != null) {
        intList.add(node.value)
        node = node.next
    }

    node = l2
    while (node != null) {
        intList.add(node.value)
        node = node.next
    }

    intList.sort()

    var index = 0
    val head = ListNode(intList[index])
    var node2 = head
    while (index < intList.size - 1) {
        node2.next = ListNode(intList[++index])
        node2 = node2.next!!
    }

    return head
}