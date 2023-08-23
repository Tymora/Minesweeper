package minesweeper

fun main() {
    val sits = 9
    val rows = 9
    val field = Array(sits) { CharArray(rows) { '.' } }
    printField(rows, sits, field)
}

fun printField (rows: Int, sits: Int, field: Array<CharArray>){
    val sitsLen = sits.toString().length + 1

    for (row in 1..rows) {
        for (sit in 1..sits) {
            print(field[sit - 1][row - 1].toString().padStart(sitsLen))
        }
        println()
    }
}

