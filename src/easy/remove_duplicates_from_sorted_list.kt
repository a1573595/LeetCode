package easy

import other.ListNode
import other.produceNode
import other.showNode

/**
 * remove-duplicates-from-sorted-list
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

fun main() {
    showNode(deleteDuplicates(produceNode(intArrayOf(1, 1, 2))))    // 1->2
    showNode(deleteDuplicates(produceNode(intArrayOf(1, 1, 1, 2))))    // 1->2
    showNode(deleteDuplicates(produceNode(intArrayOf(1, 1, 2, 3, 3))))    // 1->2->3
}

/**
 * 依序比對鏈結
 * 若數值相同則將next往下移動
 */
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