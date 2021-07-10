package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(num: String): Array<String>? {
        if (num.isEmpty() || num.toInt() < 0)
            return null

        var arrayOptions: Array<Char>
        var buffer: StringBuffer
        val list = arrayListOf<String>()

        for (i in num.indices) {
            arrayOptions = options(num[i])
            buffer = StringBuffer(num)
            arrayOptions.forEach {
                buffer.setCharAt(i, it)
                list.add(buffer.toString())
            }
        }
        return list.toTypedArray()
    }
    private fun options(number: Char): Array<Char> {
        return when (number) {
            '0' -> arrayOf('8')
            '1' -> arrayOf('2', '4')
            '2' -> arrayOf('1', '3', '5')
            '3' -> arrayOf('2', '6')
            '4' -> arrayOf('1', '5', '7')
            '5' -> arrayOf('2', '4', '6', '8')
            '6' -> arrayOf('3', '5', '9')
            '7' -> arrayOf('4', '8')
            '8' -> arrayOf('7', '5', '9', '0')
            else -> arrayOf('6', '8')
        }
    }
}