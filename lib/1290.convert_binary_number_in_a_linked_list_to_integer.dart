import 'other/list_node.dart';

void main() {
  print(getDecimalValue2(ListNode(1)..next = (ListNode(0)..next = ListNode(1))));
  print(getDecimalValue2(ListNode(0)));
}

int getDecimalValue(ListNode? head) {
  var str = "";

  while (head != null) {
    str += "${head.val}";
    head = head.next;
  }

  return int.parse(str, radix: 2);
}

int getDecimalValue2(ListNode? head) {
  var count = 0;

  while (head != null) {
    count = count << 1;

    if (head.val > 0) {
      count++;
    }
    head = head.next;
  }

  return count;
}
