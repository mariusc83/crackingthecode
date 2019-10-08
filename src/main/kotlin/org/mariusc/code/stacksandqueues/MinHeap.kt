package org.mariusc.code.stacksandqueues

import java.lang.IndexOutOfBoundsException

class MinHeap(maxSize: Int) {

    val aArray = IntArray(maxSize)
    var currentSize = -1

    fun add(toAdd: Int) {
        if (currentSize >= aArray.size) {
            throw IndexOutOfBoundsException()
        }
        currentSize++
        aArray[currentSize] = toAdd
        calibrate()
    }

    fun peek(): Int {
        return aArray[0]
    }

    fun pop(): Int {
        if (currentSize < 0) {
            throw IndexOutOfBoundsException()
        }
        swap(0, currentSize)
        val toReturn = aArray[currentSize]
        aArray[currentSize] = 0
        currentSize--
        calibrateDown()
        return toReturn
    }

    private fun calibrateDown() {
        var i = 0
        while (i < currentSize / 2) {
            val minIndex = minIndex(2 * i + 1, 2 * i + 2)
            if (aArray[minIndex] < aArray[i]) {
                swap(minIndex, i)
                i = minIndex
            } else {
                break
            }
        }
    }

    private fun minIndex(index: Int, andIndex: Int): Int {
        if (aArray[index] <= aArray[andIndex]) {
            return index
        } else {
            return andIndex
        }
    }

    private fun calibrate() {
        var i = currentSize
        while (i > 0) {
            val newI = i / 2
            if (aArray[i] < aArray[newI]) {
                // swap
                swap(i, newI)
                i = newI
            } else {
                break
            }
        }

    }

    private fun swap(index: Int, withIndex: Int) {
        val toSwap = aArray[index]
        aArray[index] = aArray[withIndex]
        aArray[withIndex] = toSwap
    }
}