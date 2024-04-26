import 'other/list_node.dart';

void main() {
  final list1 = reverseList(ListNode(1)
    ..next = (ListNode(2)..next = (ListNode(3)..next = (ListNode(4)..next = ListNode(5)))));
  list1?.printList();

  final list2 = reverseList(ListNode(1)..next = ListNode(2));
  list2?.printList();
}

ListNode? reverseList(ListNode? head) {
  var root = ListNode(0);

  while (head!=null) {
    final preNext = root.next;
    root.next = head;
    head = head.next;
    root.next?.next = preNext;
  }

  return root.next;
}
