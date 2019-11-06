package org.mariusc.code.graphsandtrees

import org.mariusc.code.linkedlists.LinkedList

fun BTree<Int>.isBalanced(): Boolean {
    val queue = LinkedList<BTree.Node<Int>>()
    if(root==null){
        return true
    }
    val map:HashMap<BTree.Node<Int>, Int> = HashMap()
    queue.add(root!!)
    while (queue.isNotEmpty){
        val node = queue.poll()!!
        if(Math.abs(nodeHeight(node.left,map)- nodeHeight(node.right, map))>1){
            return false
        }
    }

    return true
}


private fun nodeHeight(forNode: BTree.Node<Int>?, memo: HashMap<BTree.Node<Int>, Int>): Int {
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