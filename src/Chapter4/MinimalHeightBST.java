package Chapter4;

public class MinimalHeightBST {


    TreeNode createMinimalBST(int arr[], int start, int end) {
        if (start < end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr, start, mid - 1);
        n.right = createMinimalBST(arr, mid + 1, end);
        return n;
    }

    TreeNode createMinimalBST(int arr[]) {
        return createMinimalBST(arr, 0, arr.length - 1);
    }
}
