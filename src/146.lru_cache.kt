fun main() {
    val cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    println(cache.get(1))       // 1
    cache.put(3, 3)
    println(cache.get(2))       // -1
    cache.put(4, 4)
    println(cache.get(1))       // -1
    println(cache.get(3))       // 3
    println(cache.get(4))       // 4

    println()
    println()

    val cache2 = LRUCache(2)
    cache2.put(2, 1)
    cache2.put(2, 2)
    println(cache2.get(2))       // 2
    cache2.put(1, 1)
    cache2.put(4, 2)
    println(cache2.get(2))       // -1
}

class Node(val key: Int, var value: Int) {
    var previous: Node? = null
    var next: Node? = null
}

class LRUCache(val capacity: Int) {
    private val map: HashMap<Int, Node> = hashMapOf()

    private var head: Node = Node(0, 0)
    private var tail: Node = Node(0, 0)

    init {
        head.next = tail
        tail.previous = head
    }

    fun get(key: Int): Int = map[key]?.let {
        removeNode(it)
        addNode(it)
        it.value
    } ?: -1

    fun put(key: Int, value: Int) {
        val node = map[key]?.let {
            it.value = value
            removeNode(it)
            it
        } ?: run {
            Node(key, value)
        }

        addNode(node)
        map[key] = node

        while (map.size > capacity) {
            val last = tail.previous!!
            removeNode(last)
            map.remove(last.key)
        }
    }

    private fun removeNode(node: Node) {
        node.previous?.next = node.next
        node.next?.previous = node.previous
    }

    private fun addNode(node: Node) {
        val first = head.next

        head.next = node
        node.previous = head
        node.next = first
        first?.previous = node
    }
}