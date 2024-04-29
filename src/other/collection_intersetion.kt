package other

fun main() {
    val list1 = listOf(0, 1, 2, 3, 4, 5)
    val list2 = listOf(4, 5, 6, 7, 8, 9)

    println("List1: ${list1.joinToString()}")
    println("List2: ${list2.joinToString()}")

    /// O(min(n, m))、O(n + m)
    val intersection = list1.intersect(list2)
    /// O(n)、O(n + m)
    val list1Exclusive = list1.minus(list2)
    /// O(m)、O(n + m)
    val list2Exclusive = list2.minus(list1)
    /// O(n)、O(3n + 3m)
    val totalExclusive = list1Exclusive.union(list2Exclusive)

    println("Intersection: ${intersection.joinToString()}")
    println("List1 Exclusive: ${list1Exclusive.joinToString()}")
    println("List2 Exclusive: ${list2Exclusive.joinToString()}")
    println("Total Exclusive: ${totalExclusive.joinToString()}")

    println()
    println()

    val set1 = list1.toSet()
    val set2 = list2.toSet()

    val intersection2 = list2.filter { it in set1 }
    val list1Exclusive2 = list1.filterNot { it in set2 }
    val list2Exclusive2 = list2.filterNot { it in set1 }
    val totalExclusive2 = list1Exclusive2.union(list2Exclusive2)

    println("Intersection: ${intersection2.joinToString()}")
    println("List1 Exclusive: ${list1Exclusive2.joinToString()}")
    println("List2 Exclusive: ${list2Exclusive2.joinToString()}")
    println("Total Exclusive: ${totalExclusive2.joinToString()}")
}