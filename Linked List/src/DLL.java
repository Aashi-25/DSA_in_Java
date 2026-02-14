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

    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50};
        Node temp = Arr2DLL(arr); //temp pointer points to head
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
