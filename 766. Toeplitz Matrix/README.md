# 766. Toeplitz Matrix

Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

 

#### Example 1:

<img width="316" alt="Screenshot 2023-03-23 at 12 09 39 PM" src="https://user-images.githubusercontent.com/83897840/227091464-86ab135e-ad10-4f71-8a8c-5ad1b50318e6.png">

````
Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.
````

#### Example 2:

<img width="158" alt="Screenshot 2023-03-23 at 12 09 49 PM" src="https://user-images.githubusercontent.com/83897840/227091529-fcdf5cb0-80ca-466d-8975-cce65afbbd7c.png">

````
Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.
````

#### Constraints:
````
m == matrix.length
n == matrix[i].length
1 <= m, n <= 20
0 <= matrix[i][j] <= 99
````
