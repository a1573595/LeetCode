package other

import TreeNode
//import java.util.*

fun main() {
    val stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)

    println(stack.toString())

    stack.pop()
    stack.pop()

    println(stack.toString())

    println()
    println()

    val queue = Queue()
    queue.push(1)
    queue.push(2)
    queue.push(3)
    queue.push(4)
    queue.push(5)

    println(queue.toString())

    queue.pop()
    queue.pop()

    println(queue.toString())
}

private class Stack {
    private val head = TreeNode(0)
    private val tail = TreeNode(0)

    init {
        head.right = tail
        tail.left = head
    }

    fun push(value: Int) {
        val preNode = head.right
        head.right = TreeNode(value)
        head.right?.left = head
        head.right?.right = preNode
        preNode?.left = head.right
    }

    fun pop(): Int? {
        val node = head.right

        if (node != tail) {
            head.right = head.right?.right
            head.right?.left = head
        }

        return node?.`val`
    }

    override fun toString(): String {
        val str = buildString {
            var node = tail.left

            while (node != null && node != head) {
                append("${node.`val`} -> ")
                node = node.left
            }
        }
        return str
    }
}

private class Queue {
    private val head = TreeNode(0)
    private val tail = TreeNode(0)

    init {
        head.right = tail
        tail.left = head
    }

    fun push(value: Int) {
        val preNode = head.right
        head.right = TreeNode(value)
        head.right?.left = head
        head.right?.right = preNode
        preNode?.left = head.right
    }

    fun pop(): Int? {
        val node = tail.left

        if (node != head) {
            tail.left = tail.left?.left
            tail.left?.right = tail
        }

        return node?.`val`
    }

    override fun toString(): String {
        val str = buildString {
            var node = tail.left

            while (node != null && node != head) {
                append("${node.`val`} -> ")
                node = node.left
            }
        }
        return str
    }
}