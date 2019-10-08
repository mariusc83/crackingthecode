package org.mariusc.code.graphsandtrees

import java.lang.StringBuilder
import java.util.*


fun <T> Graph<T>.findPath(from: T, to: T): String {

    val visitedLeft = mutableMapOf<T, T?>()

    val visitedRight = mutableMapOf<T, T?>()

    val queueLeft = LinkedList<T>()
    val queueRight = LinkedList<T>()

    visitedLeft.put(from, null)
    visitedRight.put(to, null)
    queueLeft.add(from)
    queueRight.add(to)

    while (!(queueLeft.isEmpty()) && !(queueRight.isEmpty())) {
        val left = queueLeft.poll()
        val right = queueRight.poll()


        val childrenLeft = children(left!!)
        val childrenRight = children(right!!)

        childrenLeft.forEach {
            if (visitedRight.containsKey(it)) {
                visitedLeft.put(it, left)
                // found the pathToRight
                return path(it, visitedLeft, visitedRight)

            } else if (!visitedLeft.containsKey(it)) {
                // mark it as visited and put it in the queue
                visitedLeft.put(it, left)
                queueLeft.add(it)
            }
        }

        childrenRight.forEach {
            if (visitedLeft.containsKey(it)) {
                visitedRight.put(it, right)
                // found the pathToRight
                return path(it, visitedLeft, visitedRight)

            } else if (!visitedRight.containsKey(it)) {
                // mark it as visited and put it in the queue
                visitedRight.put(it, right)
                queueRight.add(it)
            }
        }
    }

    return ""

}

//private fun <T> formThePath(
//    it: T,
//    visitedRight: MutableMap<T, T?>,
//    visitedLeft: MutableMap<T, T?>
//): String {
//    return pathToLeft(it, visitedLeft).joinToString(" - ") + " - " + pathToRight(it, visitedRight).joinToString(" - ")
//}
//
//private fun <T> pathToRight(from: T, visited: Map<T, T?>): LinkedList<T> {
//    val paths = LinkedList<T>()
//
//    paths.add(from)
//    var previous = visited[from]
//    while (previous != null) {
//        paths.add(previous)
//        previous = visited[previous]
//    }
//
//    return paths
//}
//
//private fun <T> pathToLeft(from: T, visited: Map<T, T?>): LinkedList<T> {
//    val paths = LinkedList<T>()
//
//    var previous = visited[from]
//    while (previous != null) {
//        paths.addFirst(previous)
//        previous = visited[previous]
//    }
//
//    return paths
//}

private fun <T> path(from: T, visitedLeft: Map<T, T?>, visitedRight: Map<T, T?>): String {
    var path = "$from"
    var previous = visitedLeft[from]
    while (previous != null) {
        path = "$previous - $path"
        previous = visitedLeft[previous]
    }

    previous = visitedRight[from]

    while (previous != null) {
        path = "$path - $previous"
        previous = visitedLeft[previous]
    }

    return path
}
