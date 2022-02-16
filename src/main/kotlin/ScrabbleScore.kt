class ScrabbleScore {

    fun scoreWord(word: String): Int{
        //Calculate using the scoreLetter method below, the scrabble value of the word passed as a parameter
        //Reference: https://dnight.tistory.com/entry/Exercism-Scrabble-Score-WithKotlin
        //return word.toCharArray().map { scoreLetter(it) }.sum()
        return word.sumOf { scoreLetter(it) }
        //sumBy was there before sumOf but kotlin wanted me to change it
    }

    //TODO the program if the user enters in any chars other than capital letters...try fix this.
    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
        return when (char.uppercaseChar()) {
            'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1
            'D', 'G' -> 2
            'B', 'C', 'M', 'P' -> 3
            'F', 'H', 'V', 'W', 'Y' -> 4
            'K' -> 5
            'J', 'X' -> 8
            'Q', 'Z' -> 10
            else -> error("Unknown character")
        }
    }

    fun letterValues() = println("""Letter                           Value
           A, E, I, O, U, L, N, R, S, T       1
           D, G                               2
           B, C, M, P                         3
           F, H, V, W, Y                      4
           K                                  5
           J, X                               8
           Q, Z                               10""")
}