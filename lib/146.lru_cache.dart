import 'dart:collection';

void main() {
  final cache = LRUCache(2);
  cache.put(1, 1);
  cache.put(2, 2);
  print(cache.get(1)); // 1
  cache.put(3, 3);
  print(cache.get(2)); // -1
  cache.put(4, 4);
  print(cache.get(1)); // -1
  print(cache.get(3)); // 3
  print(cache.get(4)); // 4

  print("");
  print("");

  final cache2 = LRUCache(2);
  cache2.put(2, 1);
  cache2.put(2, 2);
  print(cache2.get(2)); // 2
  cache2.put(1, 1);
  cache2.put(4, 2);
  print(cache2.get(2)); // -1
}

class Node {
  Node({
    required this.key,
    required this.value,
  });

  final int key;
  int value;

  Node? previous;
  Node? next;
}

class LRUCache {
  LRUCache(int capacity) : _capacity = capacity {
    head.next = tail;
    tail.previous = head;
  }

  final int _capacity;
  final HashMap<int, Node> _map = HashMap();
  final head = Node(key: 0, value: 0);
  final tail = Node(key: 0, value: 0);

  int get(int key) {
    final node = _map[key];

    if (node != null) {
      removeNode(node);
      addNode(node);

      return node.value;
    } else {
      return -1;
    }
  }

  void put(int key, int value) {
    var node = _map[key];

    if (node != null) {
      node.value = value;
      removeNode(node);
    } else {
      node = Node(key: key, value: value);
    }

    addNode(node);
    _map[key] = node;

    while (_map.length > _capacity) {
      final last = tail.previous!;
      removeNode(last);
      _map.remove(last.key);
    }
  }

  void removeNode(Node node) {
    node.previous?.next = node.next;
    node.next?.previous = node.previous;
  }

  void addNode(Node node) {
    final first = head.next;

    head.next = node;
    node.previous = head;
    node.next = first;
    first?.previous = node;
  }
}
