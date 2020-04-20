package easy

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

fun main() {
    showNode(deleteDuplicates(produceNode(intArrayOf(1, 1, 2))))    // 1->2
    showNode(deleteDuplicates(produceNode(intArrayOf(1, 1, 2, 3, 3))))    // 1->2->3
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var node: ListNode? = head
    while (node != null) {
        if (node.value == node.next?.value) {
            node.next = node.next?.next
        } else {
            node = node.next
        }
    }

    return head
}