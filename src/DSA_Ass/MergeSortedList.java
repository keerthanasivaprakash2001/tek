package DSA_Ass;
 class MNode {
        int data;
        MNode next;

        MNode(int data) {
            this.data = data;
        }
    }

    class SortedList {
        MNode head;
        // Insert in sorted order
        public void addSorted(int data) {
            MNode newNode = new MNode(data);

            if (head == null || head.data >= data) {
                newNode.next = head;
                head = newNode;
                return;
            }

            MNode curr = head;
            while (curr.next != null && curr.next.data < data) {
                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
        }

        // Display List
        public void display() {
            MNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Merge two sorted linked lists
        public static MNode mergeSorted(MNode h1, MNode h2) {

            if (h1 == null) return h2;
            if (h2 == null) return h1;

            MNode result;

            if (h1.data < h2.data) {
                result = h1;
                result.next = mergeSorted(h1.next, h2);
            } else {
                result = h2;
                result.next = mergeSorted(h1, h2.next);
            }
            return result;
        }
    }

    public class MergeSortedList {
        public static void main(String[] args) {

            SortedList list1 = new SortedList();
            SortedList list2 = new SortedList();

            list1.addSorted(10);
            list1.addSorted(30);
            list1.addSorted(50);

            list2.addSorted(20);
            list2.addSorted(40);
            list2.addSorted(60);

            System.out.println("List 1:");
            list1.display();
            System.out.println("List 2:");
            list2.display();

            // Merging
            MNode mergedHead = SortedList.mergeSorted(list1.head, list2.head);

            // Display merged list
            System.out.println("Merged Sorted List:");
            MNode temp = mergedHead;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }


