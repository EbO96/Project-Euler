interface Problem {

    /**
     * Returns problem solution which can be printed
     */
    fun solve(): String

    fun Problem.log(message: String) {
        println("[$this] $message")
    }
}