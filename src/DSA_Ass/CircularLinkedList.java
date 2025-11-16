package DSA_Ass;
class CNode {
        Object data;
        CNode next;

        public CNode(Object data, CNode next) {
            this.data = data;
            this.next = next;
        }
    }

    class CircularLinkedListImp {
        CNode head;
        int count = 0;

        // Add element at end
        public void Cadd(Object ele) {
            CNode newNode = new CNode(ele, null);

            if (head == null) {
                head = newNode;
                head.next = head; // circular link
                count++;
                return;
            }

            CNode curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }

            curr.next = newNode;
            newNode.next = head;
            count++;
        }

        // Size
        public int Csize() {
            return count;
        }

        // Get based on index
        public Object Cget(int index) {
            if (index < 0 || index >= count) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            CNode curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr.data;
        }

        // Remove element based on index
        public void Cremove(int index) {
            if (index < 0 || index >= count) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            // remove head
            if (index == 0) {
                // only one element
                if (head.next == head) {
                    head = null;
                    count--;
                    return;
                }

                // find last node
                CNode last = head;
                while (last.next != head) {
                    last = last.next;
                }

                head = head.next;
                last.next = head;
                count--;
                return;
            }

            // remove from middle or end
            CNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;
            count--;
        }

        // Add at specific index
        public void Cadd(int index, Object ele) {
            if (index < 0 || index > count) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            CNode newNode = new CNode(ele, null);

            // Add at beginning
            if (index == 0) {
                if (head == null) {
                    head = newNode;
                    head.next = head;
                    count++;
                    return;
                }

                CNode last = head;
                while (last.next != head) {
                    last = last.next;
                }

                newNode.next = head;
                head = newNode;
                last.next = head;
                count++;
                return;
            }

            CNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
            count++;
        }

        // Display all
        public void Cdisplay() {

            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            CNode temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);

            System.out.println("(back to head)");
        }
    }


    public class CircularLinkedList {
        public static void main(String[] args) {
            CircularLinkedListImp c = new CircularLinkedListImp();
            c.Cadd(10);
            c.Cadd(20);
            c.Cadd(30);
            c.Cadd(40);

            System.out.println("After adding:");
            c.Cdisplay();
            c.Cadd(2, 25);
            System.out.println("After add at index 2:");
            c.Cdisplay();
            System.out.println("Element at index 3: " + c.Cget(3));
            c.Cremove(0);
            System.out.println("After removing index 0:");
            c.Cdisplay();
            c.Cremove(3);
            System.out.println("After removing index 3:");
            c.Cdisplay();
            System.out.println("Size of CLL: " + c.Csize());
        }
    }

