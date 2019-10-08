package org.mariusc.code.stacksandqueues

import org.mariusc.code.linkedlists.LinkedList

class ThreeStacks(vararg stacks: LinkedList<Int>) {

    val a: Array<Int?>
    val indexes: Array<Int>


    init {
        indexes = Array(stacks.size) { 0 }
        val size = stacks.map { it.size }.reduce { acc, i -> acc + i }
        var currentIndex = 0
        var currentStackIndex = 0
        a = Array(size) {
            if (stacks[currentStackIndex].isEmpty) {
                currentStackIndex++
                if (currentStackIndex < indexes.size) {
                    indexes[currentStackIndex] = currentIndex
                }
            }
            currentIndex++
            stacks[currentStackIndex].poll()!!
        }
    }

    fun pop(stack: Int): Int? {

        if (stack > indexes.size - 1) {
            return null
        }

        if (indexes[indexes.size - 1] >= a.size) {
            return null
        }

        if (stack > indexes.size - 1 && indexes[stack] >= indexes[stack + 1]) {
            return null
        }

        val toRemove = a[indexes[stack]]
        a[indexes[stack]] = null
        indexes[stack]++

        return toRemove
    }

}