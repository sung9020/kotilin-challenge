/*
*
* @author snow
* @since 2021/05/06
*/
fun main(args :Array<String>) {
	val quest19 = Quest19()
	val answer = 0
	println(answer)
}

class TreeNode(var `val`: Int) {
	     var left: TreeNode? = null
	     var right: TreeNode? = null
	 }

class Quest19 {
	fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
		var currentNodeA = root1
		var currentNodeB = root2
		var beforeNode = root1
		var answer: TreeNode? = null

		while(currentNodeA != null) {
			answer = if (currentNodeB != null) {
				TreeNode(currentNodeA.`val` + currentNodeB.`val`)
			} else {
				TreeNode(currentNodeA.`val`)
			}
			currentNodeA.left
		}

		return answer
	}
}