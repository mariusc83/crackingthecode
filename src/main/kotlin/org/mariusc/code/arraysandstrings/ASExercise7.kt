package org.mariusc.code.arraysandstrings

fun Array<Array<Int>>.rotateNinetyDegrees() {
    for (i in 0 until this.size / 2) {
        rotate(this, i, size - i - 1)
    }

}

fun rotate(matrix: Array<Array<Int>>, start: Int, end: Int) {
    for (i in start until end) {
        val top = matrix[start][i]
        matrix[start][i] = matrix[end-i][start]
        matrix[end-i][start] = matrix[end][end-i]
        matrix[end][end - i] = matrix[i][end]
        matrix[i][end] = top
    }

}