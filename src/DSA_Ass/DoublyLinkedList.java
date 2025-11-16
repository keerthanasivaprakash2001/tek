package DSA_Ass;
class DNode{
        DNode prev;
        Object data;
        DNode next;

        public DNode(DNode prev, Object data, DNode next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    class DoublyLinkedListImp{
        DNode head;
        int count=0;

        //Adding element at end
        public void Dadd(Object ele){
            if(head==null){
                head=new DNode(null,ele, null);
                count++;
                return;
            }
            DNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new DNode(curr, ele, null);
            count++;
        }

        //Size of the list
        public int Dsize(){
            return count;
        }


        //Get the element based on index
        public Object Dget(int in){
            DNode curr=head;
            for(int i=1; i<=in;i++){
                curr=curr.next;
            }
            return curr.data;
        }

        //Removing element based on index
        public void Dremove(int in){
            if(in==0){
                head=head.next;
                head.prev=null;
                count--;
                return;
            }
            DNode curr=head;
            for(int i=1; i<in;i++){
                curr=curr.next;
            }
            if(in==Dsize()-1){
                curr.next=null;
                count--;
                return;
            }
            curr.next=curr.next.next;
            curr.next.prev=curr;
            count--;
        }

        //Add element at specific index
        public void Dadd(int in, Object ele){
            if(in==0){
                DNode temp=new DNode(null, ele,head);
                head.prev=temp;
                head=temp;
                count++;
                return;
            }
            DNode curr=head;
            for(int i=1; i<in; i++){
                curr=curr.next;
            }
            curr.next=new DNode(curr,ele,curr.next);
            count++;
        }

        //Display all elements in the list
        public void Ddisplay(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            DNode temp=head;
            while(temp != null){
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }


    public class DoublyLinkedList {
        public static void main(String[] args) {
            DoublyLinkedListImp d = new DoublyLinkedListImp();
            d.Dadd(100);
            d.Dadd(200);
            d.Dadd("Kitti");
            d.Dadd(300);
            System.out.println("After adding:");
            d.Ddisplay();
            d.Dadd(2,250);
            System.out.println("After adding at specific index:");
            d.Ddisplay();
            System.out.println("Size of the DLL:"+d.Dsize());

        }
    }

