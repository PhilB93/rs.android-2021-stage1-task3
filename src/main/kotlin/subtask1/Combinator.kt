package subtask1

class Combinator {

    fun checkChooseFromArray(list: Array<Int>): Int? {
        val m = list[0]
        val n = list[1]
        if (m < 0 || n <= 0) {
            return null
        }
        for (i in 1..n) {
            if ((num(n) / (num(i) * num(n - i))).toInt() == m)
                return i
        }
        return null
    }
     private fun num(n: Int): Long {
        var number = 1L
        for (i in 1..n) {
            number *= i
        }
        return number
    }
}