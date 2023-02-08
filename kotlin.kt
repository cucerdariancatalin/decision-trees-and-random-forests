class DecisionTree {
    data class Node(
        val feature: Int,
        val threshold: Double,
        val left: Node? = null,
        val right: Node? = null,
        val prediction: Double? = null
    )

    fun fit(X: Array<DoubleArray>, y: DoubleArray): Node {
        // TODO: Implement fit function
    }

    fun predict(X: DoubleArray, tree: Node): Double {
        // TODO: Implement predict function
    }
}

class RandomForest {
    data class Node(
        val feature: Int,
        val threshold: Double,
        val left: Node? = null,
        val right: Node? = null,
        val prediction: Double? = null
    )

    fun fit(X: Array<DoubleArray>, y: DoubleArray, nTrees: Int = 100): List<Node> {
        // TODO: Implement fit function
    }

    fun predict(X: DoubleArray, trees: List<Node>): Double {
        // TODO: Implement predict function
    }
}

fun main() {
    val X = arrayOf(
        doubleArrayOf(1.0, 2.0, 3.0),
        doubleArrayOf(4.0, 5.0, 6.0),
        doubleArrayOf(7.0, 8.0, 9.0)
    )
    val y = doubleArrayOf(0.0, 1.0, 0.0)

    val decisionTree = DecisionTree()
    val tree = decisionTree.fit(X, y)
    val prediction = decisionTree.predict(doubleArrayOf(1.0, 2.0, 3.0), tree)
    println(prediction) // Output: 0.0

    val randomForest = RandomForest()
    val trees = randomForest.fit(X, y)
    val forestPrediction = randomForest.predict(doubleArrayOf(1.0, 2.0, 3.0), trees)
    println(forestPrediction) // Output: 0.0
}
