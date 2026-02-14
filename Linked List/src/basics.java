public class basics {
    public static void main(String[] args) {
        int[] arr = {2 , 3 , 5 , 6};
        Node y = new Node(arr[3]);
        System.out.println(y.data);
        Node head = convertArr2LL(arr);
        System.out.println(head.data);
        System.out.println("length of LL is :-" + lengthOfLL(head));
        System.out.println(checkIfPresent(head , 2));
        //traversal
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        //calling deletion of head fn
        head = removesHead(head);
        System.out.println("head after deleting current head is :- " + head.data);

        //calling deletion of tail fn
        head = removesTail(head);
        System.out.println("tail after deleting current tail is :- " + head.data);

        //calling deletion of kth element fn
        head = removeK(head , 2);
        Node temp1 = head;
        while(temp1 != null){
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }

        //calling deletion of given val
        head = removeEl(head , 3);
        Node temp2 = head;
        while(temp2 != null){
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }

        //insert at head
        head = insertAtHead(head , 100);
        System.out.println(head.data);

        //insert at given index
        head = insertAtindex(head , 200 , 1);
        Node temp3 = head;
        while(temp3 != null){
            System.out.print(temp3.data + " ");
            temp3 = temp3.next;
        }

        //inset before given value
        head = InsertBefElement(head , 200 , 50);
        Node temp4 = head;
        while(temp4 != null){
            System.out.print(temp4.data + " ");
            temp4 = temp4.next;
        }

    }

    static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    static int checkIfPresent(Node head , int val){
        Node temp = head;
        while (temp != null){
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    //delete head
    static Node removesHead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }

    //delete tail
    static Node removesTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //deleting kth element
    static Node removeK(Node head , int k){
        if(head==null) return null;
        if(k == 1){
            Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    //deleting given val
    static Node removeEl(Node head , int val) {
        if (head == null) return null;
        if (val == head.data) {
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data == val){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    //insert at head
    static Node insertAtHead(Node head , int val){
        Node temp = new Node(100 , head);
        return temp;
    }

    //insert at given index
    static Node insertAtindex(Node head , int val , int idx){
        if(head == null) {
            if (idx == 1) {
                return new Node(val);
            } else {
                return null;
            }
        }
        if(idx == 1){
            return new Node(val , head);
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == idx-1){
                Node x = new Node(val , temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    //insert element before given value -> x is the value to be inserted before val
    static Node InsertBefElement(Node head , int val , int x){
        if(head == null){
            return null;
        }
        if(head.data == val){
            return new Node(x , head);
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == val){
                Node newNode = new Node(x , temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}




