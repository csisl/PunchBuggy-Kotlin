abstract class Vehicle constructor(color: String) {
    abstract val color: String
    abstract fun incrementCount()
    abstract fun decrementCount()
    abstract fun getCount(): Int
    companion object Colors {
        val colors: Array<String> = arrayOf("red", "orange", "yellow", "green", "blue",
            "purple", "pink", "black", "white", "silver")
    }
}