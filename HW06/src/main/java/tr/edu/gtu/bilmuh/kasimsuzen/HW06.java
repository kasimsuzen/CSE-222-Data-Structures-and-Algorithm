package tr.edu.gtu.bilmuh.kasimsuzen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by siyah on 13.04.2016.
 */
public class HW06 {
    public static void main(String[] args){
        System.out.printf("HOMEWORK 6 PART 1 TEST\n");
        String hw06Result;
        BinaryTree<HuffmanTree.HuffData> asd = new BinaryTree<>();
        HuffmanTree Htree = new HuffmanTree();
        hw06Result = Htree.encode("merhaba bendeburaya yeni geldim lol rofl wow wowww",asd);
        System.out.printf("Part 1 result %s\n",hw06Result);

        System.out.printf("Part 2 results \n");

        BinarySearchTree<Integer> BSTree = new BinarySearchTree<Integer>();
        BSTree.add(2);
        BSTree.add(1);
        BSTree.add(12);
        BSTree.add(20);
        BSTree.add(11);
        BSTree.add(50);
        BSTree.add(80);
        BSTree.add(55);
        BSTree.add(99);

        System.out.println(BSTree.find(21));
        System.out.println(BSTree.toString());
        BSTree.add(15);
        System.out.println(BSTree.toString());
        BSTree.delete(11);
        System.out.println(BSTree.toString());
        System.out.printf("%s\nafter",BSTree.toString());
        Iterator it = BSTree.iterator();
        while(it.hasNext()){
            Integer a = (Integer) it.next();
            if(a != null)
                System.out.printf("%s \n",a);
            else
                System.out.printf("null\n");
        }
        System.out.printf("Part 2 results ends\n");
        System.out.printf("Part 3 results \n\n");
        test(1000);
        System.out.printf("Part 3 results ends\n");

    }

    public static void test(int size){
        Random random = new Random();
        Comparator<Integer> myComp = new myComparator();

        PriorityVector<Integer> priVect = new PriorityVector<>();
        PriorityArrayList<Integer> priArray = new PriorityArrayList<>(myComp);
        PriorityBinaryTree<Integer> priBiTree = new PriorityBinaryTree<>();
        PriorityLinkedList<Integer> priLin = new PriorityLinkedList<>();
        int randomInt = 0;
        long arrayMilli,vectorMilli,binaryMilli,linkedMilli;

        System.out.printf("Vector add Test\n");
        vectorMilli = System.currentTimeMillis();
        for(int i=0; i < size;++i){
            randomInt = random.nextInt(100);
            priVect.add(randomInt);
        }
        System.out.printf("Amount of Time for at vector as millisecond is  ");
        System.out.println(System.currentTimeMillis() - vectorMilli);

        System.out.printf("Array add test\n");
        arrayMilli = System.currentTimeMillis();

        for(int i=0; i < size;++i) {
            randomInt = random.nextInt(100);
            priArray.add(randomInt);
        }
        System.out.printf("Amount of Time for at array as millisecond is  ");
        System.out.println(System.currentTimeMillis() - arrayMilli);

        System.out.printf("Binary Tree add test\n");
        binaryMilli = System.currentTimeMillis();

        for(int i=0; i < size;++i) {
            randomInt = random.nextInt(100);
            priBiTree.add(randomInt);
        }

        System.out.printf("Amount of Time for at binary as millisecond is  ");
        System.out.println(System.currentTimeMillis() - binaryMilli);

        System.out.printf("Linked list add test\n");
        linkedMilli = System.currentTimeMillis();
        for(int i=0; i < size;++i) {
            randomInt = random.nextInt(100);
            priLin.add(randomInt);
        }

        System.out.printf("Amount of Time for at linked as millisecond is  ");
        System.out.println(System.currentTimeMillis() - linkedMilli);

        System.out.printf("Vector poll Test\n");
        vectorMilli = System.currentTimeMillis();
        while(!priVect.isEmpty()){
            priVect.poll();
            //System.out.printf("%d\n",priVect.poll());
        }
        System.out.printf("Amount of Time for at vector as millisecond is  ");
        System.out.println(System.currentTimeMillis() - vectorMilli);

        System.out.printf("Array poll test\n");
        arrayMilli = System.currentTimeMillis();
        while(!priArray.isEmpty()) {
            priArray.poll();
            //System.out.printf("%d\n", priArray.poll());
        }
        System.out.printf("Amount of Time for at array as millisecond is  ");
        System.out.println(System.currentTimeMillis() - arrayMilli);

        System.out.printf("Binary Tree poll test\n");
        binaryMilli = System.currentTimeMillis();
        while(!priBiTree.isEmpty()) {
            priBiTree.poll();
            //System.out.printf("%d\n", priBiTree.poll());
        }
        System.out.printf("Amount of Time for at binary as millisecond is  ");
        System.out.println(System.currentTimeMillis() - binaryMilli);


        System.out.printf("Linked list poll test\n");
        linkedMilli = System.currentTimeMillis();
        while(!priLin.isEmpty()) {
            priLin.poll();
            //System.out.printf("%d\n", priLin.poll());
        }
        System.out.printf("Amount of Time for at linked as millisecond is  ");
        System.out.println(System.currentTimeMillis() - linkedMilli);
    }
}

class myComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2)
            return 1;
        if (o2 == o1)
            return 0;
        else
            return -1;
    }
}