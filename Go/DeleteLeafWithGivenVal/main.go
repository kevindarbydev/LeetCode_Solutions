package main

type TreeNode struct {
	Val int
	Left  *TreeNode
	Right *TreeNode
}

func NewTreeNode(value int) *TreeNode {
	return &TreeNode{
		Val: value,
		Left:  nil,
		Right: nil,
	}
}

func main() {
	root := NewTreeNode(1)
	root.Left = NewTreeNode(2)
	root.Right = NewTreeNode(3)
	root.Left.Left = NewTreeNode(2)
	root.Right.Left = NewTreeNode(2)
	root.Right.Right = NewTreeNode(4)
}

// first attempt

// func removeLeafNodes(root *TreeNode, target int) *TreeNode {
// 	node := root
// 	if node == nil {
// 		return nil
// 	}
// 	node.Left = removeLeafNodes(node.Left, target)
// 	node.Right = removeLeafNodes(node.Right, target)

// 	if node.Val == target {
// 		if node.Left == nil {
// 			return node.Right
// 		}
// 		if node.Right == nil {
// 			return node.Left
// 		}
// 		// both sides are present
// 		right := node.Left
// 		for right.Right != nil {
// 			right = right.Right
// 		}
// 		// update
// 		node.Val = right.Val
// 		// recurse right
// 		node.Left = removeLeafNodes(node.Left, right.Val)
// 	}
// 	return node
// }

// better solution from chatgpt
func removeLeafNodes(node *TreeNode, target int) *TreeNode {
    if node == nil {
        return nil
    }

    node.Left = removeLeafNodes(node.Left, target)
    node.Right = removeLeafNodes(node.Right, target)

    // Check if the current node is a leaf node and its value matches the target
    if node.Left == nil && node.Right == nil && node.Val == target {
        return nil
    }

    return node
}