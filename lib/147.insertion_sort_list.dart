import 'other/list_node.dart';

void main() {
  print(insertionSortList(
      ListNode(4)..next = (ListNode(2)..next = (ListNode(1)..next = ListNode(3)))));
  print(insertionSortList(ListNode(-1)
    ..next = (ListNode(5)..next = (ListNode(3)..next = (ListNode(4)..next = ListNode(0))))));
}

ListNode? insertionSortList(ListNode? head) {
  final newHead = ListNode(0);
  ListNode? indexNode;
  ListNode? tempNode;

  while (head != null) {
    indexNode = newHead;

    while (indexNode?.next != null && indexNode!.next!.val < head.val) {
      indexNode = indexNode.next;
    }

    tempNode = head.next;
    head.next = indexNode?.next;
    indexNode?.next = head;
    head = tempNode;
  }

  return newHead.next;
}
