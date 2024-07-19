
class LinkedListCustom {
    Node head;

    public LinkedListCustom() {
        this.head = null;
    }

    public void addLast(Product value) {
        Node curr = this.head;

        if (curr == null) {
            this.head = new Node(value);
        } else {
            while (curr.next != null)
                curr = curr.next;
            curr.next = new Node(value);
        }
    }

    public void addFirst(Product value) {
        Node curr = this.head;
        
        this.head = new Node(value);
        head.next = curr;
    }

    public void print() {
        Node curr = this.head;
        
        while (curr != null) {
            System.out.print(curr.value.getProductName() + ": " + curr.value.getQuantity() + "\n");
            curr = curr.next;
        }
        System.out.print("\b");
    }

    public boolean checkIfExists(String product) {
        Node curr = this.head;
        boolean flag = false;

        while (curr != null) {
            if (!curr.value.getProductName().toUpperCase().equals(product.toUpperCase())) {
                flag = false;
                curr = curr.next;
            } else {
                flag = true;
                break;
            }
        }
        return flag;
    }
}