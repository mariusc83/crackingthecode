package org.marius.code.graphsandtrees

import org.junit.Test
import org.mariusc.code.graphsandtrees.BTree
import org.mariusc.code.graphsandtrees.nodesLevelsMap
import org.assertj.core.api.Assertions.assertThat

class GTExercise3Test {
    lateinit var underTest: BTree<Int>


    @Test
    fun useCase1() {
        underTest = BTree()
        underTest.add(4)
        underTest.add(2)
        underTest.add(6)
        underTest.add(0)
        underTest.add(3)
        underTest.add(5)
        underTest.add(8)

        val nodesLevelsMap = underTest.nodesLevelsMap()


        assertThat(nodesLevelsMap.size).isEqualTo(3)
        assertThat(nodesLevelsMap[0].toString()).isEqualTo("4")
        assertThat(nodesLevelsMap[1].toString()).isEqualTo("2 - 6")
        assertThat(nodesLevelsMap[2].toString()).isEqualTo("0 - 3 - 5 - 8")
    }
}