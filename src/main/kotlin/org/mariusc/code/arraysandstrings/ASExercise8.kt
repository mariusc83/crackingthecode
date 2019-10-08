package org.mariusc.code.arraysandstrings

fun Array<Array<Int>>.emptyColumnsAndRows() {
    if (this.isEmpty()) return

    val columns: IntArray = IntArray(this[0].size)

    val rows: IntArray = IntArray(this.size)

    this.forEachIndexed { row, a ->
        a.forEachIndexed { column, value ->
            if (value == 0) {
                columns[column] = 1
                rows[row] = 1
            }
        }
    }

    rows.forEachIndexed { index, value ->
        if (value == 1) {
            turnRowTo0(this, index)
        }
    }
    columns.forEachIndexed { index, value ->
        if (value == 1) {
            turnColumnTo0(this, index)
        }
    }
}

private fun turnColumnTo0(matrix: Array<Array<Int>>, columnIndex: Int) {
    for (i in 0 until matrix.size) {
        matrix[i][columnIndex] = 0
    }
}

private fun turnRowTo0(matrix: Array<Array<Int>>, rowIndex: Int) {
    for (i in 0 until matrix[0].size) {
        matrix[rowIndex][i] = 0
    }
}