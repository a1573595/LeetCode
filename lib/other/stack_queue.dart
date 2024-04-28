import 'tree_node.dart';

void main() {
  final stack = _Stack();
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  stack.push(5);

  print(stack);

  stack.pop();
  stack.pop();

  print(stack);

  print("");
  print("");

  final queue = _Queue();
  queue.push(1);
  queue.push(2);
  queue.push(3);
  queue.push(4);
  queue.push(5);

  print(queue);

  queue.pop();
  queue.pop();

  print(queue);
}

class _Stack {
  final head = TreeNode(0);
  final tail = TreeNode(0);

  _Stack() {
    head.right = tail;
    tail.left = head;
  }

  void push(int value) {
    final preNode = head.right;
    head.right = TreeNode(value);
    head.right?.left = head;
    head.right?.right = preNode;
    preNode?.left = head.right;
  }

  int? pop() {
    final node = head.right;

    if (node != tail) {
      head.right = head.right?.right;
      head.right?.left = head;
    }

    return node?.val;
  }

  @override
  String toString() {
    final buffer = StringBuffer();

    var node = tail.left;

    while (node != null && node != head) {
      buffer.write("${node.val} -> ");
      node = node.left;
    }

    return buffer.toString();
  }
}

class _Queue {
  final head = TreeNode(0);
  final tail = TreeNode(0);

  _Queue() {
    head.right = tail;
    tail.left = head;
  }

  void push(int value) {
    final preNode = head.right;
    head.right = TreeNode(value);
    head.right?.left = head;
    head.right?.right = preNode;
    preNode?.left = head.right;
  }

  int? pop() {
    final node = tail.left;

    if (node != head) {
      tail.left = tail.left?.left;
      tail.left?.right = tail;
    }

    return node?.val;
  }

  @override
  String toString() {
    final buffer = StringBuffer();

    var node = tail.left;

    while (node != null && node != head) {
      buffer.write("${node.val} -> ");
      node = node.left;
    }

    return buffer.toString();
  }
}
