package Chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreteLevelLinkedList {

    void createLevelLinkedList(TreeNode root, List<List<TreeNode>> lists, int level) {
        if (root == null) return;

        List<TreeNode> levelList = null;
        if (lists.size() == level) {
            levelList = new LinkedList<>();
            lists.add(levelList);
        } else {
            levelList = lists.get(level);
        }
        levelList.add(root);

        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }

    List<List<TreeNode>> createLevelLinkedList(TreeNode root) {
        List<List<TreeNode>> lists = new ArrayList<>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    List<List<TreeNode>> createLevelLinkedList2(TreeNode root) {

        List<List<TreeNode>> lists = new ArrayList<>();
        List<TreeNode> current = new LinkedList<>();
        if (root != null) {
            current.add(root);
        }

        while (!current.isEmpty()) {
            lists.add(current);
            List<TreeNode> parents = current;
            current = new LinkedList<>();
            for (TreeNode parent : parents) {
                if (parent.left != null) {
                    current.add(parent.left);
                }

                if (parent.right != null) {
                    current.add(parent.right);
                }
            }

        }

        return lists;
    }

}
