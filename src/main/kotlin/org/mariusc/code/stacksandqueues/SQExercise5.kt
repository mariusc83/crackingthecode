package org.mariusc.code.stacksandqueues

import org.mariusc.code.linkedlists.LinkedList

fun LinkedList<Int>.sort(): LinkedList<Int> {
    if (isEmpty) return this


    val intermediary1 = LinkedList<Int>()

    var cursor = this.poll()

    while (cursor != null) {
        var toCompareWith = intermediary1.peek()
        while (toCompareWith != null && cursor > toCompareWith) {
            this.add(intermediary1.poll()!!)
            toCompareWith = intermediary1.peek()
        }
        intermediary1.addFirst(cursor)
        cursor = this.poll()
    }

    return intermediary1
}