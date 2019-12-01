package org.mariusc.code.graphsandtrees

import org.mariusc.code.linkedlists.LinkedList
import java.lang.StringBuilder

class BTree<T : Comparable<T>> {


    var root: Node<T>? = null
    var size = 0


    fun add(value: T) {
        val node = Node(value)
        if (root == null) {
            root = node
        } else {
            addNode(root!!, node)
        }
        size++
    }

    private fun addNode(to: Node<T>, toAdd: Node<T>) {
        if (toAdd.value <= to.value) {
            if (to.left == null) {
                to.left = toAdd
            } else {
                addNode(to.left!!, toAdd)
            }
        } else {
            if (to.right == null) {
                to.right = toAdd
            } else {
                addNode(to.right!!, toAdd)
            }
        }
    }

    override fun toString(): String {
        if (root == null) {
            return ""
        }

        val stringBuilder = StringBuilder()
        val queue = LinkedList<Pair<Node<T>, Int>>()
        queue.add(Pair(root!!, 0))
        val levels = IntArray(size) { -1 }
        while (queue.isNotEmpty) {
            val nodeLevelPair = queue.poll()!!
            val currentLevel = nodeLevelPair.second
            if (levels[currentLevel] < 0 && currentLevel != 0) {
                stringBuilder.delete(stringBuilder.length - 1, stringBuilder.length)
                stringBuilder.append("\n")
            }
            stringBuilder.append("${nodeLevelPair.first.value} ")
            levels[currentLevel] = 1
            nodeLevelPair.first.left?.let {
                queue.add(Pair(it, currentLevel + 1))
            }
            nodeLevelPair.first.right?.let {
                queue.add(Pair(it, currentLevel + 1))
            }
        }


        return stringBuilder.toString().trim()
    }

    fun nodeHeight(forNode: BTree.Node<T>?, memo: HashMap<BTree.Node<T>, Int>): Int {
        if (forNode == null) {
            return -1
        }
        if (memo.containsKey(forNode)) {
            return memo[forNode]!!
        }

        val nodeHeight = Math.max(nodeHeight(forNode.left, memo), nodeHeight(forNode.right, memo)) + 1
        memo.put(forNode, nodeHeight)
        return nodeHeight
    }

    data class Node<T>(val value: T, var left: Node<T>? = null, var right: Node<T>? = null)
}