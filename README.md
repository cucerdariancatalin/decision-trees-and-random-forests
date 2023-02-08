# Decision Trees in Kotlin

This repository contains an implementation of Decision Trees in Kotlin for classification and regression tasks. 

## Prerequisites
- Kotlin 1.4 or higher
- Gradle 4.10 or higher

## Getting Started
Clone this repository and build the project using Gradle:
gradle build

## Usage
```kotlin
import com.example.decisiontree.DecisionTree

// Initialize a decision tree model for binary classification
val decisionTree = DecisionTree(maxDepth = 10)

// Train the model on a training dataset
decisionTree.fit(trainFeatures, trainLabels)

// Predict on a test dataset
val predictions = decisionTree.predict(testFeatures)

##Contributing
We welcome contributions to improve this implementation of Decision Trees in Kotlin. Please submit a pull request if you have any changes to suggest.
