class Get {
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        while(head!= null){
            if(head.data == x) return true;
            else head = head.next;
        }
        return false;
    }
}