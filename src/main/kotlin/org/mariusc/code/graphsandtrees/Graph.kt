package org.mariusc.code.graphsandtrees

import java.lang.StringBuilder

class Graph<T> {

    val vertices = mutableMapOf<T, MutableList<Vertex<T>>>()

    fun addVertex(value: T) {
        vertices.putIfAbsent(value, mutableListOf())
    }

    fun addEdge(from: T, to: T) {
        vertices.putIfAbsent(from, mutableListOf())
        vertices[from]!!.add(Vertex(to))
    }


    fun children(of: T): List<T> {
        return vertices[of]?.map { it.value } ?: emptyList()
    }

    val size: Int
        get() = vertices.size

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        vertices.forEach { mapEntry ->
            val childrenToString = mapEntry
                .value
                .map { it.value.toString() }
                .reduce { acc, next ->
                    "$acc , $next"
                }
            stringBuilder.appendln("${mapEntry.key} -> ${childrenToString}")
        }

        return stringBuilder.toString().trim()
    }

    data class Vertex<T>(val value: T)
}