package subtask2

import kotlin.math.sqrt

class SquareDecomposer {
    fun decomposeNumber(num: Int): Array<Int>? {
        val sumSquareNumber = num.toLong() * num.toLong()
        return findDecomposition(sumSquareNumber, num)?.toTypedArray()
    }

    private fun findDecomposition(sumOfSquares: Long, num: Int): ArrayList<Int>? {
        if (sumOfSquares < 0) return null
        if (sumOfSquares == 0L) return arrayListOf()

        var list: ArrayList<Int>? = null
        var bufferNumber = num
        while (list == null && bufferNumber > 1) {
            bufferNumber--
            val newSumSquareNumber = sumOfSquares - (bufferNumber.toLong() * bufferNumber.toLong())
            list = findDecomposition(newSumSquareNumber, bufferNumber)
        }
        list?.add(bufferNumber)
        return list
    }
}