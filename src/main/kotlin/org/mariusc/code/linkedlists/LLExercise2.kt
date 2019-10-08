package org.mariusc.code.linkedlists

fun <T> LinkedList<T>.elementAtPosFromTail(pos: Int): T? {
    val intermediary = LinkedList<T>()

    var cursor = head
    while (cursor != null) {
        intermediary.addFirst(cursor.value)
        cursor = cursor.next
    }

    cursor = intermediary.head
    var currentPos = pos
    while (cursor != null && currentPos > 0) {
        cursor = cursor.next
        currentPos--
    }
    if (currentPos > 0) {
        return null
    }
    return cursor?.value
}