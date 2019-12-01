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