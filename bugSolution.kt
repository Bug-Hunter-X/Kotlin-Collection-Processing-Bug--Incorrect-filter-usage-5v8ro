```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    // Correct usage of filterIndexed to find even numbers at even indices
    val evenNumbersAtEvenIndices = list.filterIndexed { index, value -> index % 2 == 0 && value % 2 == 0 }
    println(evenNumbersAtEvenIndices) // Output: [2]
}
```