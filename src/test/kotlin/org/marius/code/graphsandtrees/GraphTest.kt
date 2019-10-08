package org.marius.code.graphsandtrees

import org.junit.Before
import org.junit.Test
import org.mariusc.code.graphsandtrees.Graph
import org.assertj.core.api.Assertions.assertThat

class GraphTest {

    lateinit var underTest: Graph<Int>

    @Before
    fun setUp() {
        underTest = Graph()
    }

    @Test
    fun testCase1() {
        underTest.addVertex(1)
        underTest.addVertex(2)
        underTest.addVertex(3)
        underTest.addVertex(4)
        underTest.addEdge(1, 2)
        underTest.addEdge(1, 3)
        underTest.addEdge(2, 4)
        underTest.addEdge(3, 1)
        underTest.addEdge(4, 1)
        underTest.addEdge(4, 3)

        assertThat(underTest.toString()).isEqualTo("1 -> 2 , 3\n2 -> 4\n3 -> 1\n4 -> 1 , 3".trimIndent())
    }
}