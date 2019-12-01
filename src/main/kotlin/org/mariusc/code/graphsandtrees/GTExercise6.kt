package org.mariusc.code.graphsandtrees

import org.mariusc.code.linkedlists.LinkedList
import org.mariusc.code.linkedlists.Node
import java.lang.StringBuilder

fun Graph<Char>.projectsPath(): String {

    if (vertices.isEmpty()) return ""

    val visited = hashSetOf<Char>()

    val stringBuilder = StringBuilder()
    vertices.forEach {
        projectPath(it.key, stringBuilder, visited)
    }
    return stringBuilder.toString()
}


private fun Graph<Char>.projectPath(
    forNode: Char,
    stringBuilder: StringBuilder,
    visited: HashSet<Char>
) {
    if (visited.contains(forNode)) {
        return
    }

    visited.add(forNode)

    val children = children(forNode)
    children.forEach {
        projectPath(it, stringBuilder, visited)
    }
    stringBuilder.append(forNode)
}