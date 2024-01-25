package com.ww.test1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author weiwei
 * @Date 2024/1/16 11:08
 */
public class Test {

    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
//
//        System.out.println(a[0][1]);

        System.out.println("11111111111111");
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNodel = new TreeNode(4);
        TreeNode treeNoder = new TreeNode(6);
        treeNode.left = treeNodel;
        treeNode.right = treeNoder;

        ArrayList<Integer> integers = PrintFromTopToBottom(treeNode);
        System.out.println(integers.size());
        System.out.println(integers.indexOf(0));
        System.out.println(integers.indexOf(1));
        System.out.println(integers.indexOf(2));
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (deque.size()>0) {
            TreeNode node = deque.removeFirst();
            ans.add(node.val);
            if (node.left != null) {
                deque.add(root.left);
            }
            if (node.right != null) {
                deque.add(root.right);
            }
        }
        return ans;
    }
}
