package org.mariusc.code.linkedlists

fun <T> LinkedList<T>.findCircularNode(): Node<T>? {
    var cursor = head
    var fastCursor = head?.next

    while (fastCursor != null) {
        if (cursor == fastCursor) {
            cursor = head
            fastCursor = fastCursor.next
            while (fastCursor != null && cursor != null) {
                if (fastCursor == cursor) {
                    return cursor
                }
                fastCursor = fastCursor.next
                cursor = cursor.next
            }
        }
        fastCursor = fastCursor?.next?.next
        cursor = cursor?.next
    }

    return null
}