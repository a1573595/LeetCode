class ListNode {
  int val;
  ListNode? next;

  ListNode([this.val = 0, this.next]);
}

extension ListNodeExtension on ListNode {
  void printList() {
    ListNode? root = this;

    var str = "";

    while (root != null) {
      str += "${root.val} -> ";
      root = root.next;
    }

    print(str);
  }
}
