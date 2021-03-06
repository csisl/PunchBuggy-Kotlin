abstract class Vehicle constructor(color: String) {
    abstract val color: String
    private var count: Int = 0

    open fun incrementCount() {
        count++
    }

    open fun decrementCount() {
        if (count > 0) {
            count--
        } else {
            println("Unable to decrement a count of 0")
        }
    }

    fun getCount(): Int = count

    companion object Colors {
        val colors: Array<String> = arrayOf("red", "orange", "yellow", "green", "blue",
            "purple", "pink", "black", "white", "silver")
    }
}