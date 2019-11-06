package org.mariusc.code.graphsandtrees

fun createBinaryTree(anArray: IntArray): BTree<Int> {
    val btree = BTree<Int>()
    addToBinaryTree(0, anArray.size - 1, anArray, btree)
    return btree
}

private fun addToBinaryTree(start: Int, end: Int, anArray: IntArray, tree: BTree<Int>) {
    val middle = start + (end - start) / 2
    if (middle < 0 || middle > end) return
    tree.add(anArray[middle])
    addToBinaryTree(start, middle - 1, anArray, tree)
    addToBinaryTree(middle + 1, end, anArray, tree)
}