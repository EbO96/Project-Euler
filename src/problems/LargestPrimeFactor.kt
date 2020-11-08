package problems

import Problem
import kotlin.math.sqrt

/**
 * Solution for [https://projecteuler.net/problem=3]
 */
class LargestPrimeFactor : Problem {

    private val input: Long = 600851475143

    /**
     * 1. Find square of [input]
     * 2. Find all factors of [input]
     * 3. Search for largest prime number among all factors
     */
    override fun solve(): String {
        val square: Int = sqrt(input.toDouble()).toInt()
        log("Square = $square")
        val allFactors = (square downTo 2).filter { input % it == 0L }
        val largestPrimeFactor = allFactors.sortedByDescending { it }.firstOrNull { it.isPrime() }
        log("All factors\n${allFactors.joinToString("\n") { "$it is factor of $input" }}")
        return "Largest prime factor for $input is $largestPrimeFactor"
    }

    private fun Int.isPrime(): Boolean {
        ((this - 1) downTo 2).forEach {
            if (this % it == 0) {
                return false
            }
        }
        return true
    }
}