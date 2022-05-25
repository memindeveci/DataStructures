public class LinkedList<T> {

    public Node<T> head;

    public void Traverse() {


        if (head == null) {
            return;
        }

        Node<T> temp = head;

        while(temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);



    }

    public LinkedList<T> Insert(T val) {
        Node<T> node = new Node<T>(val);
        if (head == null) {
            head = node;
        }

        else {

            Node<T> iterNode = head;
            while(iterNode.next != null) {
                iterNode = iterNode.next;
            }

            iterNode.next = node;
        }

        return this;

    }

    public LinkedList<T> Delete(T val) {
        Node<T> node = new Node<T>(val);
        if (head == null) {
            head = node;
            return this;
        }

        Node<T> tempNode = head;
        while(tempNode.next == node) {

            tempNode = tempNode.next;
        }

        // the loop would get to the (n-1)'th node, if we say the desired node is n. Therefore, we need to get the 'next' of the tempNode
        tempNode.next = tempNode.next.next;

        return this;
    }



//    public static void main(String[] args) {
//
//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.Insert(10);
//        list.Insert(5);
//        list.Insert(8);
//        list.Insert(7);
//        list.Insert(9);
//        list.Insert(1);
//
//        System.out.println("LinkedList before deletion: ");
//        list.Traverse();
//        System.out.println("\nLinkedList after deletion: ");
//        list.Delete(5);
//
//        list.Traverse();
//
//
//    }
}
