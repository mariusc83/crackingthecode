package org.marius.code.linkedlists

import org.junit.Test
import org.mariusc.code.linkedlists.LinkedList
import org.mariusc.code.linkedlists.plus
import org.assertj.core.api.Assertions.assertThat

class LLExercise4Test {

    @Test
    fun testCase1() {
        val list1 = LinkedList<Int>()
        val list2 = LinkedList<Int>()
        list1.add(7)
        list1.add(1)
        list1.add(6)
        list2.add(5)
        list2.add(9)
        list2.add(2)

        val list3 = list1 + list2


        assertThat(list3.toString()).isEqualTo("2 - 1 - 9")

    }
}