package DSA_Ass;

    class Node{
        Node next;
        int value;
        Node(int value){
            this.value=value;
        }
    }
    public class ReverseLinkedList {
        public static void main(String[] args) {
            Node head=new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=new Node(4);
            head.next.next.next.next=new Node(5);
            printList(head);
            Node rev = rev(head);
            printList(rev);

        }

        private static Node rev(Node head) {
            Node curr=head;
            Node pre=null;

            while (curr!=null){
                Node next=curr.next;
                curr.next=pre;
                pre=curr;
                curr=next;
            }
            return pre;
        }

        public static void printList(Node head) {
            while (head != null) {
                System.out.print(head.value + " -> ");
                head = head.next;
            }
            System.out.println("null");
        }
    }






