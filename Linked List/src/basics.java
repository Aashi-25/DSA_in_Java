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
        }
        return 0;
    }
}
class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};



