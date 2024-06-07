class ListNode {
  int val;
  ListNode? next;

  ListNode([this.val = 0, this.next]);

  @override
  String toString() {
    var str = "";
    var node = this.next;

    str += "$val";

    while (node != null) {
      str += "->${node.val}";
      node = node.next;
    }

    return str;
  }
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
