package DSA_Ass;

class Node{
        Object data;
        Node next;

        public Node(Object data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    class SinglyLinkedListImpl {
        Node head;
        int count=0;

        //Add element at end
        public void add(Object ele){
            if(head==null){
                head=new Node(ele, null);
                count++;
                return;
            }

            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }

            curr.next=new Node(ele,null);
            count++;
        }


        //Adding element at specific index
        public void add(int in, Object ele){
            if(in < 0 || in >= count){
                throw new ArrayIndexOutOfBoundsException();
            }
            if (in == 0) {
                head=new Node(ele, head);
                count++;
                return;
            }
            Node curr=head;
            for(int i=1; i<in; i++){
                curr=curr.next;
            }
            curr.next=new Node(ele,curr.next);
            count++;
        }
        //Size of the list
        public int size(){
            return count;
        }

        //Search the element based on index
        public Object get (int in){
            if(in < 0 || in >= count){
                throw new ArrayIndexOutOfBoundsException();
            }
            Node curr=head;
            for(int i=1; i<=in;i++){
                curr=curr.next;
            }
            return curr.data;
        }

        //Display
        public void dispaly(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }

            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        //Remove the element based on the index
        public void remove(int in){

            if(in==0){
                head=head.next;
                count--;
                return;
            }

            if(in<0 || in>size()) throw new ArrayIndexOutOfBoundsException();
            Node curr=head;

            for(int i=1; i<in;i++){
                curr=curr.next;
            }

            curr.next=curr.next.next;
            count--;
        }
    }


    public class SinglyLinkedList {
        public static void main(String[] args){
            SinglyLinkedListImpl s=new SinglyLinkedListImpl();
            s.add(10);
            s.add(20);
            s.add(30);
            s.add(40);
            s.add(50);
            System.out.println("After adding");
            s.dispaly();
            s.add(1,15);
            System.out.println("After addding at specific position");
            s.dispaly();
            s.remove(3);
            System.out.println("After removing");
            s.dispaly();
            System.out.println("Size of SLL:"+s.size());
        }
    }

