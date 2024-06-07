import 'other/list_node.dart';

void main() {
  print(reverseBetween(
      ListNode(1)
        ..next = (ListNode(2)..next = (ListNode(3)..next = (ListNode(4)..next = ListNode(5)))),
      2,
      4));
  print(reverseBetween(
      ListNode(1)
        ..next = (ListNode(2)..next = (ListNode(3)..next = (ListNode(4)..next = ListNode(5)))),
      3,
      4));
  print(reverseBetween(ListNode(5), 1, 1));
  print(reverseBetween(ListNode(3)..next = ListNode(5), 1, 2));
}

ListNode? reverseBetween(ListNode? head, int left, int right) {
  ListNode? preHead = null;
  ListNode? reverseFoot = head;

  for (var i = 0; i < left - 1; i++) {
    preHead = reverseFoot;
    reverseFoot = reverseFoot?.next;
  }

  ListNode? reverseHead = reverseFoot;
  ListNode? next = reverseHead?.next;
  ListNode? temp;
  reverseHead?.next = null;

  for (var i = left; i < right; i++) {
    temp = reverseHead;
    reverseHead = next;
    next = next?.next;
    reverseHead?.next = temp;
  }

  preHead?.next = reverseHead;
  reverseFoot?.next = next;

  return preHead != null ? head : reverseHead;
}
