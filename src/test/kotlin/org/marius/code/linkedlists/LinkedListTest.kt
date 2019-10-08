package org.marius.code.linkedlists

import org.junit.Before
import org.junit.Test
import org.mariusc.code.linkedlists.LinkedList
import org.assertj.core.api.Assertions.assertThat

class LinkedListTest {
    lateinit var underTest: LinkedList<Int>

    @Before
    fun setUp(){
        underTest = LinkedList()
    }

    @Test
    fun testAddElement(){
        underTest.add(2)

        assertThat(underTest.head!!.value).isEqualTo(2)
        assertThat(underTest.tail!!.value).isEqualTo(2)
    }

    @Test
    fun testAddElements(){
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)

        assertThat(underTest.head!!.value).isEqualTo(1)
        assertThat(underTest.tail!!.value).isEqualTo(3)
        assertThat(underTest.toString()).isEqualTo("1 - 2 - 3")
    }

    @Test
    fun testAddFirstElement(){
        underTest.addFirst(1)

        assertThat(underTest.toString()).isEqualTo("1")
    }

    @Test
    fun testAddFirstElements(){
        underTest.addFirst(1)
        underTest.addFirst(2)
        underTest.addFirst(3)

        assertThat(underTest.toString()).isEqualTo("3 - 2 - 1")
    }

    @Test
    fun testSize1(){
        underTest.add(1)
        underTest.addFirst(2)
        underTest.add(3)

        assertThat(underTest.size).isEqualTo(3)
    }

    @Test
    fun testSize2(){
        underTest.add(1)
        underTest.addFirst(2)
        underTest.add(3)
        underTest.poll()
        underTest.poll()
        underTest.poll()
        underTest.poll()

        assertThat(underTest.size).isEqualTo(0)
    }

    @Test
    fun testRemove(){
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)

        assertThat(underTest.poll()).isEqualTo(1)
        assertThat(underTest.poll()).isEqualTo(2)
    }

}