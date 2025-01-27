package lab19;
import lab19.methods.*;

public class Main {
    public static void main(String[] args) {
        // Древо в правую сторону
        int[] lisValues = {2,3,4};
        Node firstNode = new Node(1);
        // Центральный обход
        traversalCenter treeCentral = new traversalCenter();
        treeCentral.addLeaf(lisValues, firstNode);
        treeCentral.traversalTree(firstNode);
        System.out.println();
        // Обход справа
        traversalRight treeRight = new traversalRight();
        treeRight.addLeaf(lisValues, firstNode);
        treeRight.traversalTree(firstNode);
        System.out.println();
        // Обход слева
        traversalLeft treeLeft = new traversalLeft();
        treeLeft.addLeaf(lisValues, firstNode);
        treeLeft.traversalTree(firstNode);

    }
}
