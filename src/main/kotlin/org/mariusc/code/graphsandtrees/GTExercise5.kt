package org.mariusc.code.graphsandtrees

import java.util.*
import kotlin.collections.HashMap

fun BTree<Int>.isBST(): Boolean {

    if (root == null) return true

    val map: HashMap<BTree.Node<Int>, Int> = HashMap()
    val queue = LinkedList<BTree.Node<Int>>()
    queue.add(root!!)
    while (queue.isNotEmpty()) {
        val node = queue.poll()!!
        if (Math.abs(nodeHeight(node.left, map) - nodeHeight(node.right, map)) > 1) {
            return false
        }
        node.left?.let {
            if (it.value > node.value) {
                return false
            }
            queue.add(it)
        }
        node.right?.let {
            if (it.value < node.value) {
                return false
            }
            queue.add(it)
        }

    }

    return true


}