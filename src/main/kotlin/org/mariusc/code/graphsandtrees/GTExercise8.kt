package org.mariusc.code.graphsandtrees

import org.mariusc.code.linkedlists.LinkedList
import org.mariusc.code.linkedlists.Node

fun BTree<Int>.composedArrays(): List<List<Int>> {

    return arrays(root)
}

private fun arrays(forNode: BTree.Node<Int>?): List<List<Int>> {
    if (forNode == null) {
        return emptyList()
    }


    val listOfLists = merge(arrays(forNode.left), arrays(forNode.right))
    listOfLists.forEach {
        it.add(forNode.value)
    }

    return listOfLists
}


fun merge(l1: List<List<Int>>, l2: List<List<Int>>): List<MutableList<Int>> {

    val newListOfLists: MutableList<MutableList<Int>> = mutableListOf()
    l1.forEach { outer ->
        l2.forEach {
            val newList = mutableListOf<Int>()
            outer.forEach {
                newList.add(it)
            }

            it.forEach {
                newList.add(it)
            }
            newListOfLists.add(newList)
        }
    }

    l2.forEach { outer ->
        l1.forEach {
            val newList = mutableListOf<Int>()
            outer.forEach {
                newList.add(it)
            }

            it.forEach {
                newList.add(it)
            }
            newListOfLists.add(newList)
        }
    }

    return newListOfLists
}

