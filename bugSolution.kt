fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList2 = list2.filter { it % 2 != 0 }.toMutableList()
    println(newList2) // Output: [1, 3, 5]

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filter { it.value % 2 != 0 }.toMutableMap()
    println(newMap) // Output: {a=1, c=3}

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it % 2 != 0 }.toMutableSet()
    println(newSet) // Output: [1,3,5]
} 