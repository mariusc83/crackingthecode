package org.mariusc.code.linkedlists

fun LinkedList<Char>.isPalindrome(): Boolean {

    var cursor = head
    var fastCursor = head?.next
    val intermediaryList: LinkedList<Char> = LinkedList()

    if (cursor == null) {
        return true
    }

    while (fastCursor != null && fastCursor != tail) {
        intermediaryList.addFirst(cursor!!.value)
        cursor = cursor.next
        fastCursor = fastCursor.next?.next
    }
    if (fastCursor == tail) {
        intermediaryList.addFirst(cursor!!.value)
    }

    cursor = cursor?.next

    fastCursor = intermediaryList.head
    while (cursor != null) {
        if (cursor.value != fastCursor!!.value) {
            return false
        }
        cursor = cursor.next
        fastCursor = fastCursor.next
    }

    return true
}