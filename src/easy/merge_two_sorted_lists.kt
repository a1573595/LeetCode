package easy

// https://leetcode.com/problems/merge-two-sorted-lists/

fun main(args: Array<String>) {
    val list = IntArray(3)
    list.sort()

    val l: ArrayList<Int> = ArrayList()
    l.sort()
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if(l1 == null && l2 == null) return null

    val intList: ArrayList<Int> = ArrayList()

    var node: ListNode? = l1
    while(node != null) {
        intList.add(node.value)
        node = node.next
    }

    node = l2
    while(node != null) {
        intList.add(node.value)
        node = node.next
    }

    intList.sort()

    var index = 0
    val head = ListNode(intList[index])
    var node2 = head
    while (index < intList.size-1) {
        node2.next = ListNode(intList[++index])
        node2 = node2.next!!
    }

    return head
}