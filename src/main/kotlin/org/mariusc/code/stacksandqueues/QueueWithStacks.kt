package org.mariusc.code.stacksandqueues

import org.mariusc.code.linkedlists.LinkedList
import org.mariusc.code.linkedlists.Node
import kotlin.ConcurrentModificationException

class QueueWithStacks {
    val stackIn = LinkedList<Int>()
    val stackOut = LinkedList<Int>()
    var size = 0

    fun add(element: Int) {
        stackIn.add(element)
        size++
    }

    fun peek(): Int? {
        sanityCheck()
        return stackOut.peek()
    }

    fun pop(): Int? {
        if (size == 0) {
            return null
        }
        sanityCheck()
        size--
        return stackOut.poll()
    }

    private fun sanityCheck() {
        if (stackOut.isEmpty) {
            moveAllToOut()
        }
    }

    private fun moveAllToOut() {
        var cursor = stackIn.poll()
        while (cursor != null) {
            stackOut.add(cursor)
            cursor = stackIn.poll()
        }
    }

    operator fun iterator(): Iterator<Int> {
        return QueueWithStackIterator(size)
    }


    inner class QueueWithStackIterator(val startSize: Int) : Iterator<Int> {
        var cursor: Node<Int>?

        init {
            moveAllToOut()
            cursor = stackOut.peekNode()
        }

        override fun hasNext(): Boolean {
            if (startSize != size) {
                throw ConcurrentModificationException()
            }

            return cursor != null
        }

        override fun next(): Int {
            if (size != startSize) {
                throw ConcurrentModificationException()
            }
            val toReturn = cursor
            cursor = cursor?.next
            return toReturn!!.value
        }
    }

}