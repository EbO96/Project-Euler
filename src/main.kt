import problems.LargestPrimeFactor

private val problems = mapOf<Int, () -> Problem>(
    4 to { LargestPrimeFactor() }
)

fun main(args: Array<String>) {
    getProblemById(4).printSolution()
}

private fun getProblemById(@Suppress("SameParameterValue") id: Int) =
    problems[id]?.invoke() ?: throw  Exception("Cannot find problem with ID = $id")

private fun Problem.printSolution() {
    print(solve())
}