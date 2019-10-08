package org.mariusc.code.linkedlists

fun LinkedList<Int>.reorderAfter(element: Int) {

    var cursor:Node<Int>? = null
    var fastCursor = head
    while (fastCursor != null) {
        if (fastCursor.value < element && fastCursor != head) {
            // move to head
            val nextCursor = fastCursor.next
            cursor!!.next = nextCursor
            fastCursor.next = head
            head = fastCursor
            fastCursor = nextCursor
        }
        else{
            cursor = fastCursor
            fastCursor = cursor.next
        }
    }


}