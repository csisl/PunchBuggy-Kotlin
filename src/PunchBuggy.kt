class PunchBuggy constructor(override val color: String): Vehicle(color) {

    private var count: Int = 0

    override fun incrementCount() {
        count++
    }

    override fun decrementCount() {
        if (count > 0) {
            count--
        } else {
            println("Unable to decrement a count of 0")
        }
    }

    override fun getCount(): Int {
        return count
    }

}