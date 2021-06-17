package LinkedLists;

import java.util.Stack;

public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public MyLinkedList(Node<T> node) {
        this.head = node;
    }

    public void insertSorted(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.compareTo(element) < 0 && current.data.compareTo(element) >= 0) {
                current.next = new Node<>(element, current.next);
                return;
            }

            current = current.next;
        }
    }

    public T findMiddleLinkedlist() {
        int s = sizeRecursive();

        int middle = s / 2;

        int counter = 0;
        Node<T> current = head;
        while (counter < middle) {
            current = current.next;
            counter++;
        }

        return current.data;
    }

    public T findMiddleRecursive() {
        return findMiddleRecursive(0, head);
    }

    private T findMiddleRecursive(int counter, Node<T> element) {
        if (counter == sizeRecursive() / 2) {
            return element.data;
        }

        return findMiddleRecursive(counter + 1, element.next);
    }

    public void insert(T element) {
        if (head == null) {

            head = new Node<>(element, null);
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node<>(element, null);
    }

    public MyLinkedList<T> addList(MyLinkedList<T> linkedList) throws Exception {
        Node<T> current = head;
        if (current.data instanceof Integer) {
            int firstNumber = 0;
            int exp = 0;
            while (current != null) {
                firstNumber += (Integer) current.data * (int)(Math.pow(10, exp));
                current = current.next;
                exp++;
            }

            current = linkedList.head;
            int secondNumber = 0;
            exp = 0;
            while (current != null) {
                secondNumber += (Integer) current.data * (int)(Math.pow(10, exp));
                current = current.next;
                exp++;
            }

            int sum = firstNumber + secondNumber;
            MyLinkedList<T> linkedList1 = new MyLinkedList<>();
            current = linkedList1.head;
            while (sum > 0) {
                Integer data = (Integer) current.data;
                data = sum % 10;
                sum /= 10;
                current = current.next;
            }

            return linkedList1;
        }

        throw new Exception("Unable to perform addition on these lists");

    }

    public int indexOf(T element) {
        if (head.data.compareTo(element) == 0) {
            return 0;
        }

        int counter = 1;
        Node<T> current = head.next;
        while (current != null) {
            if (current.data.compareTo(element) == 0) {
                return counter;
            }
            current = current.next;
            counter++;
        }

        return -1;
    }

    public int size() {
        int counter = 0;
        Node<T> current = head;
        while (current != null) {
            current = current.next;
            counter++;
        }

        return counter;
    }

    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append("->");
            }

            current = current.next;
        }

        return sb.toString();
    }

    public void reverseLinkedList() {
        Node<T> current = head;
        Stack<T> stack = new Stack<>();
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        current = head;

        while (current != null) {
            current.data = stack.pop();
            current = current.next;
        }
    }

//    public int sumRecursive() {
//        return sumRecursive(head);
//    }
//
//    private int sumRecursive(LinkedLists.Node<T> element) {
//        if (element == null) {
//            return 0;
//        }
//        return element.data + sumRecursive(element.next);
//    }

    public int sizeRecursive() {
        return sizeRecursive(head);
    }

    private int sizeRecursive(Node<T> element) {
        if (element == null) {
            return 0;
        }

        return 1 + sizeRecursive(element.next);
    }

    public T delete(T element) {
        if (head.data.compareTo(element) == 0) {
            T deleted = head.data;
            head = head.next;
            return deleted;
        }

        Node<T> previous = null;
        Node<T> current = head;
        while (current.next != null) {
            if (current.data.compareTo(element) == 0) {
                assert previous != null;
                previous.next = current.next;
                return current.data;
            }
            previous = current;
            current = current.next;
        }

        if (current.data.compareTo(element) == 0) {
            T deleted = current.data;
            previous.next = null;
            current = null;
            return deleted;
        }

        return null;
    }
}

class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    public Node() {

    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
