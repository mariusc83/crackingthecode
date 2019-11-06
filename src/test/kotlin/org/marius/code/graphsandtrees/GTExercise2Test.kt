package org.marius.code.graphsandtrees

import org.mariusc.code.graphsandtrees.createBinaryTree
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class GTExercise2Test {

    @Test
    fun useCase1() {

        val bTree = createBinaryTree(intArrayOf(0, 1, 2, 3, 4, 5, 6))
        assertThat(bTree.toString()).isEqualTo("3\n1 5\n0 2 4 6")
    }
}