import 'other/list_node.dart';

void main() {
  print(partition(
      ListNode(1)
        ..next = (ListNode(4)
          ..next = (ListNode(3)..next = (ListNode(2)..next = (ListNode(5)..next = ListNode(2))))),
      3));
  print(partition(ListNode(2)..next = ListNode(1), 2));
}

ListNode? partition(ListNode? head, int x) {
  ListNode leftHead = ListNode(0);
  ListNode rightHead = ListNode(0);
  ListNode left = leftHead;
  ListNode right = rightHead;

  while (head != null) {
    if (head.val < x) {
      left.next = head;
      left = left.next!;
    } else {
      right.next = head;
      right = right.next!;
    }
    head = head.next;
  }

  left.next = rightHead.next;
  right.next = null;

  return leftHead.next;
}
