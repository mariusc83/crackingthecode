package org.mariusc.code.arraysandstrings


fun String.hasAPalyndromePermutation(): Boolean {
    forEachIndexed { index: Int, c: Char ->
        if (perms(c.toString(), this.removeRange(index, index + 1))) {
            return true
        }
    }

    return false
}

private fun perms(prefix: String, s: String): Boolean {

    if (s.length == 0) {
        return isPlayndrome(prefix)
    }

    s.forEachIndexed { index: Int, c: Char ->
        if (perms(c.toString(), s.removeRange(index, index + 1))) {
            return true
        }
    }
    return false
}

private fun isPlayndrome(s: String): Boolean {
    val length = s.length
    val halfIndex = length/ 2
    for (i in 0 until halfIndex) {
        if (s[i] != s[length-1]) return false
    }
    return true
}