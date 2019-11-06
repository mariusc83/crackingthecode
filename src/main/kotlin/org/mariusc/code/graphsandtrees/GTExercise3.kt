package org.mariusc.code.graphsandtrees

import org.mariusc.code.linkedlists.LinkedList

fun BTree<Int>.nodesLevelsMap(): Map<Int, LinkedList<Int>> {

    if (root == null) return emptyMap()
    val map = mutableMapOf<Int, LinkedList<Int>>()
    val queue = LinkedList<Pair<BTree.Node<Int>, Int>>()
    queue.add(Pair(root!!, 0))
    while (queue.isNotEmpty) {
        val nodeLevelPair = queue.poll()!!
        val level = nodeLevelPair.second
        map.putIfAbsent(level, LinkedList())
        map[level]!!.add(nodeLevelPair.first.value)
        nodeLevelPair.first.left?.let {
            queue.add(Pair(it, level + 1))
        }
        nodeLevelPair.first.right?.let {
            queue.add(Pair(it, level + 1))
        }
    }

    return map
}