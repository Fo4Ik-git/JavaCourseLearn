package com.fo4ik.learn.tree;

import com.fo4ik.learn.stack.SimpleQueue;
import com.fo4ik.learn.stack.SimpleStack;


public class Tree {

    /**
     *  Tree is a graph without cycles
     *
     */

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(20,
                new BinaryTree(7,
                        new BinaryTree(4, null, new BinaryTree(6)),
                        new BinaryTree(9)),
                new BinaryTree(35,
                        new BinaryTree(31, new BinaryTree(28), null),
                        new BinaryTree(40, new BinaryTree(38), new BinaryTree(52))));

//        System.out.println("Sum of all values in tree: " + binaryTree.sumRecursive());
        System.out.println("Sum of all values in tree: " + binaryTree.sumDeep(binaryTree));
        System.out.println("Sum of all values in tree: " + binaryTree.sumWide(binaryTree));
    }

    static class BinaryTree {
        private int value;
        private BinaryTree left, right;

        public BinaryTree(int value, BinaryTree left, BinaryTree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public BinaryTree(int value) {
            this.value = value;
        }

        /**
         *  This method is recursive
         *
         * @return - Integer sum of all values in tree
         */
        public int sumRecursive(){
            int sum = value;
            if(left != null){
                sum += left.sumRecursive();
            }
            if(right != null){
                sum += right.sumRecursive();
            }
            return sum;
        }


        /**
         * For this method we to use stack {@link SimpleStack}
         *
         * @param node
         * @return - Integer sum of all values in tree
         */
        public int sumDeep(BinaryTree node){
            SimpleStack<BinaryTree> stack = new SimpleStack<>();
            stack.push(node);

            int sum = 0;

            while (!stack.isEmpty()){
                BinaryTree currentNode = stack.pop();
                sum += currentNode.getValue();

                if(currentNode.getRight() != null){
                    stack.push(currentNode.getRight());
                }
                if(currentNode.getLeft() != null){
                    stack.push(currentNode.getLeft());
                }
            }

            return sum;
        }

        /**
         * For this method we to use queue {@link SimpleQueue}
         *
         * @param node
         * @return - Integer sum of all values in tree
         */
        public int sumWide(BinaryTree node){
            SimpleQueue<BinaryTree> queue = new SimpleQueue<>();
            queue.add(node);

            int sum = 0;

            while (!queue.isEmpty()){
                BinaryTree currentNode = queue.remove();
                sum += currentNode.getValue();

                if(currentNode.getRight() != null){
                    queue.add(currentNode.getRight());
                }
                if(currentNode.getLeft() != null){
                    queue.add(currentNode.getLeft());
                }
            }

            return sum;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BinaryTree getLeft() {
            return left;
        }

        public void setLeft(BinaryTree left) {
            this.left = left;
        }

        public BinaryTree getRight() {
            return right;
        }

        public void setRight(BinaryTree right) {
            this.right = right;
        }
    }

}
