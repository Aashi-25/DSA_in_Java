public class DLL {
    static Node Arr2DLL(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i] , null , prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    //delete head of DLL
    static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    //delete tail of DLL
    static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;
        return head;
    }

    //delete kth element
    static Node deleteKelement(Node head , int k){
        if(head == null) return null;
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k) break;

            temp = temp.next;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if(prev == null && front == null){
            return null;
        }else if(prev == null){
            deleteHead(head);
        }else if(front == null){
            deleteTail(head);
        }else{
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node temp = Arr2DLL(arr); //temp pointer points to head
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        //delete head
        Node head = Arr2DLL(arr);
        head = deleteHead(head);
        System.out.println(head.data);

        //delete tail
        head = deleteTail(head);
        Node temp1 = head;
        while(temp1 != null){
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println();

        //delete kth element
        head = deleteKelement(head , 3);
        Node temp2 = head;
        while(temp2 != null){
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }
    }
}
