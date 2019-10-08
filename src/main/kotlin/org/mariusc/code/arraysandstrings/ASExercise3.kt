package org.mariusc.code.arraysandstrings

fun stripCharacters(s: String, trueLength: Int): String {
    val charsArray = s.toCharArray()
    var pointer = trueLength - 1
    var realPointer = charsArray.size - 1
    while (pointer >= 0) {
        if (charsArray[pointer] == ' ') {
            charsArray[realPointer] = '0'
            realPointer--
            charsArray[realPointer] = '2'
            realPointer--
            charsArray[realPointer] = '%'
            realPointer--
        } else {
            charsArray[realPointer] = charsArray[pointer]
            realPointer--
        }

        pointer--
    }

    return String(charsArray)
}