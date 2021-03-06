public class solution328 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode odd = head, even = head.next, tmp = even;
        while (odd != null && even != null) {
            odd.next = even.next;
            if (odd.next == null) {
                break;
            }
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = tmp;
        return head;
    }
}
