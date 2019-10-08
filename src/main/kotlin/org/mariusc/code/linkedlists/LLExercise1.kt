package org.mariusc.code.linkedlists

fun <T> LinkedList<T>.removeDuplicates() {
    val currentHead = head
    val set: MutableSet<T> = mutableSetOf()

    if (currentHead?.next == null) {
        return
    }

    var slowCursor = currentHead
    var fastCursor = slowCursor.next

    while (fastCursor != null) {
        set.add(slowCursor!!.value)
        if (set.contains(fastCursor.value)) {
            slowCursor.next = fastCursor.next
            fastCursor = slowCursor.next
        } else {
            slowCursor = slowCursor.next
            fastCursor = slowCursor?.next
        }
    }
}

