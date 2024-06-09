import 'other/list_node.dart';

void main() {
  print(rotateRight(
      ListNode(1)
        ..next = (ListNode(2)..next = (ListNode(3)..next = (ListNode(4)..next = ListNode(5)))),
      2));
  print(rotateRight(ListNode(0)..next = (ListNode(1)..next = ListNode(2)), 4));
  print(rotateRight(ListNode(1), 1));
}

ListNode? rotateRight(ListNode? head, int k) {
  if (head == null || k == 0) {
    return head;
  }

  var size = 0;
  for (ListNode? node = head; node != null; node = node.next) {
    size++;
  }

  k %= size;

  if (k == 0) {
    return head;
  }

  ListNode? previous = null;
  ListNode? newHead = head;
  for (var i = 0; i < size - k; i++) {
    previous = newHead;
    newHead = newHead?.next;
  }

  ListNode? node = newHead;
  while (node?.next != null) {
    node = node?.next;
  }
  node?.next = head;
  previous?.next = null;

  return newHead;
}
