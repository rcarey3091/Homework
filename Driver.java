public class Driver {
    public static void main(String[] args) {
        System.out.println("Circular Linked List Tester");

        System.out.println("Create, insert, and print test by adding values 1-4");

        GenCircularLinkedList<Integer> l = new GenCircularLinkedList<Integer>();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.showList();
        System.out.println();

        System.out.println("Moving current twice and deleting the current");
        l.goToNext();
        l.goToNext();
        l.deleteCurrent();
        l.showList();
        System.out.println();

        System.out.println("Testing In list by searching for the value 4");
        System.out.println(l.inList(4));
        System.out.println();

        System.out.println("Testing In list by searching for the value 3");
        System.out.println(l.inList(3));
        System.out.println();
        

        System.out.println("Testing getting and setting current by adding the value 10 to the current data.");
        l.setDataAtCurrent(14);
        l.showList();
        System.out.println();

        System.out.println("Moving current forward and deleting that node.");
        l.goToNext();
        l.deleteCurrent();
        l.showList();
        System.out.println();

        System.out.println("Moving current backwards and deleting that node");
        l.goToPrev();
        l.deleteCurrent();
        l.showList();
        System.out.println();

        System.out.println("Test Done");
    }
}