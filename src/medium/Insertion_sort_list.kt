package medium

import other.ListNode
import other.produceNode
import other.showNode

/**
 * insertion-sort-list
 * https://leetcode.com/problems/insertion-sort-list/
 * A graphical example of insertion sort. The partial sorted list (black) initially contains only the first element in the list.
 * With each iteration one element (red) is removed from the input data and inserted in-place into the sorted list
 *
 * Algorithm of Insertion Sort:
 * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 */

fun main() {
//    showNode(insertionSortList(produceNode(intArrayOf(4, 2, 1, 3)))) // 1, 2, 3, 4
    showNode(insertionSortList(produceNode(intArrayOf(-1, 5, 3, 4, 0)))) // -1, 0, 3, 4, 5
}

/**
 * 生成一個新的Node
 * 依照大小插入新數值
 * 最後返回新的Node的next
 */
fun insertionSortList(head: ListNode?): ListNode? {
    val newHead = ListNode(0)
    var indexNode = newHead
    var currentNode = head

    while (currentNode != null) {
        indexNode = newHead
        while (indexNode.next != null && indexNode.next?.value!! < currentNode.value) {
            indexNode = indexNode.next!!
        }

        val next = currentNode.next
        currentNode.next = indexNode.next
        indexNode.next = currentNode
        currentNode = next
    }

    return newHead.next
}