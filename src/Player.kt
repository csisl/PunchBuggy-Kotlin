class Player constructor(val username: String){

    private var punchBuggies: MutableList<PunchBuggy> = mutableListOf()

    init {
        initializePunchBuggies()
    }

    private fun initializePunchBuggies() {
        Vehicle.colors.forEach() {
            val buggy = PunchBuggy(it)
            punchBuggies.add(buggy)
        }
    }

    private fun getCurrentPunchBuggy(color: String): PunchBuggy {
        punchBuggies.forEach() {
            if (it.color == color) {
                return it
            }
        }
        TODO("What do we return when the color doesn't match?")
    }

}