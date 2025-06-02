/**
 *
 * @author Motasem
 */
public class YildizKhouliBinarySearchTree<T extends Comparable<T>> {
    YildizKhouliBstNode<T> root;

    // INSERT node
    void insert(T newData) {
        YildizKhouliBstNode<T> newNode = new YildizKhouliBstNode<>(newData);

        if (root == null) {
            root = newNode;
        } else {
            YildizKhouliBstNode<T> temp = root;

            while (temp != null) {
                if (newData.compareTo(temp.data) > 0) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return;
                    }
                    temp = temp.right;
                } else if (newData.compareTo(temp.data) < 0) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        return;
                    }
                    temp = temp.left;
                } else {
                    return;
                }
            }
        }
    }

    YildizKhouliBstNode<T> deleteRec(T key) {
        return deleteRec(root, key);
    }

    private YildizKhouliBstNode<T> deleteRec(YildizKhouliBstNode<T> node, T key) {
        if (node == null) {
            return node;
        }
        if (key.compareTo(node.data) < 0) {
            node.left = deleteRec(node.left, key);
        } else if (key.compareTo(node.data) > 0) {
            node.right = deleteRec(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = min(node.right);
            node.right = deleteRec(node.right, node.data);
        }
        return node;
    }

    T max() {
        YildizKhouliBstNode<T> temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;
    }

    T min() {
        if (root == null) {
            System.out.println("Tree is empty!");
            return null;
        }
        YildizKhouliBstNode<T> temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    T min(YildizKhouliBstNode<T> startNode) {
        while (startNode.left != null) {
            startNode = startNode.left;
        }
        return startNode.data;
    }

    boolean search(T searchData) {
        if (root == null) {
            return false;
        } else {
            YildizKhouliBstNode<T> temp = root;

            while (temp != null) {
                if (searchData.compareTo(temp.data) > 0) {
                    temp = temp.right;
                } else if (searchData.compareTo(temp.data) < 0) {
                    temp = temp.left;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    int heightOfTree() {
        return heightOfTree(root);
    }

    private int heightOfTree(YildizKhouliBstNode<T> n) {
        if (n == null) {
            return -1;
        }
        int leftSub = heightOfTree(n.left);
        int rightSub = heightOfTree(n.right);
        return Math.max(leftSub, rightSub) + 1;
    }

    int size() {
        return size(root);
    }

    private int size(YildizKhouliBstNode<T> node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + size(node.right) + 1;
    }

    int fullNodeCount() {
        return fullNodeCount(root);
    }

    private int fullNodeCount(YildizKhouliBstNode<T> node) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.left != null && node.right != null) {
            count = 1;
        }
        return count + fullNodeCount(node.left) + fullNodeCount(node.right);
    }

    private void preOrder(YildizKhouliBstNode<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void preOrder() {
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
    }

    private void inOrder(YildizKhouliBstNode<T> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void inOrder() {
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();
    }

    private void postOrder(YildizKhouliBstNode<T> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void postOrder() {
        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();
    }

    // Level-order traversal (not implemented yet)
    void levelOrder() {
    }

    private int sumRecursive(YildizKhouliBstNode<T> node) {
        if (node != null) {
            if (node.data instanceof Number) {
                return ((Number) node.data).intValue() + sumRecursive(node.left) + sumRecursive(node.right);
            }
        }
        return 0;
    }

    int sumRecursive() {
        return sumRecursive(root);
    }
}
