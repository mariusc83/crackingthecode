package org.mariusc.code.linkedlists

import java.lang.StringBuilder

class LinkedList<T> {

    var head: Node<T>? = null
        internal set
    var tail: Node<T>? = null
        private set

    var size = 0

    fun add(value: T) {
        val node = Node(value)
        size++
        if (head == null) {
            head = node
            tail = node
            return
        }

        tail!!.next = node
        tail = node
    }

    fun add(node: Node<T>) {
        size++
        if (head == null) {
            head = node
            tail = node
            return
        }

        tail!!.next = node
        tail = node
    }

    fun addFirst(value: T) {
        val node = Node(value)
        size++
        if (head == null) {
            head = node
            tail = node
            return
        }

        node.next = head
        head = node
    }

    fun poll(): T? {
        val toRemove = head
        if (toRemove != null) {
            head = toRemove?.next
            toRemove.next = null
            size--
        }

        return toRemove?.value
    }

    fun peek(): T? {
        return head?.value
    }

    fun peekNode(): Node<T>? {
        return head
    }

    override fun toString(): String {
        if (head == null) {
            return ""
        }
        val stringBuilder = StringBuilder()
        var cursor = head
        while (cursor != null) {
            stringBuilder.append(cursor.value).append(" - ")
            cursor = cursor.next
        }


        return stringBuilder.substring(0, stringBuilder.length - 3).toString()
    }

    val isEmpty: Boolean
        get() = size == 0

    val isNotEmpty: Boolean
        get() = size > 0
}

class Node<T>(var value: T, var next: Node<T>? = null)