package org.mariusc.code.graphsandtrees

fun BTree<Int>.findFirstCommonParent(forValue: Int, andValue: Int): Int? {
    return findCommon(root, forValue, andValue)
}

private fun findCommon(node: BTree.Node<Int>?, forValue: Int, andValue: Int): Int? {
    if (node == null) {
        return null
    }

    val checkLeft = findCommon(node.left, forValue, andValue)
    val checkRight = findCommon(node.right, forValue, andValue)

    if (checkLeft != null && checkLeft != forValue && checkLeft != andValue) {
        return checkLeft // we found the common node
    }
    if (checkRight != null && checkRight != forValue && checkRight != andValue) {
        return checkRight // we found the common node
    }

    if (checkLeft == forValue && checkRight == andValue || checkLeft == andValue && checkRight == forValue) {
        return node.value
    } else if (checkLeft != null) {
        return checkLeft
    } else if (checkRight != null) {
        return checkRight
    } else if (node.value == forValue || node.value == andValue) {
        return node.value
    } else {
        return null
    }

}