package org.mariusc.code.linkedlists

operator fun LinkedList<Int>.plus(other: LinkedList<Int>):LinkedList<Int> {
    var pointer1 = this.head
    var pointer2 = other.head
    val newList = LinkedList<Int>()
    var toMove = 0
    while (pointer1 != null && pointer2 != null) {
        val sum = pointer1.value + pointer2.value + toMove
        toMove = sum / 10
        newList.add(sum.rem(10))
        pointer1 = pointer1.next
        pointer2 = pointer2.next
    }

    var pointer = pointer1 ?: pointer2
    while (pointer != null) {
        val sum = pointer.value + toMove
        toMove = sum / 10
        newList.add(sum.rem(10))
        pointer = pointer.next
    }

    return newList
}