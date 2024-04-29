void main() {
  final list1 = [0, 1, 2, 3, 4, 5];
  final list2 = [4, 5, 6, 7, 8, 9];

  print("List1: ${list1.join(", ")}");
  print("List2: ${list2.join(", ")}");

  final set1 = list1.toSet();
  final set2 = list2.toSet();

  /// O(min(n, m))、O(n + m)
  final intersection = list2.where((element) => set1.contains(element));

  /// O(n)、O(n + m)
  final list1Exclusive = list1.where((element) => !set2.contains(element));

  /// O(m)、O(n + m)
  final list2Exclusive = list2.where((element) => !set1.contains(element));

  /// O(max(n, m))、O(3n + 3m)
  final totalExclusive = [...list1Exclusive, ...list2Exclusive];

  print("Intersection: ${intersection.join(", ")}");
  print("List1 Exclusive: ${list1Exclusive.join(", ")}");
  print("List2 Exclusive: ${list2Exclusive.join(", ")}");
  print("Total Exclusive: ${totalExclusive.join(", ")}");
}
