void main() {
  print(1.toBinaryString());
  print(2.toBinaryString());
  print(3.toBinaryString());
  print(4.toBinaryString());
  print(5.toBinaryString());

  print("");
  print("");

  print(3.toOctalString());
  print(4.toOctalString());
  print(5.toOctalString());
  print(8.toOctalString());
  print(16.toOctalString());

  print("");
  print("");

  print(3.toHexString());
  print(4.toHexString());
  print(5.toHexString());
  print(8.toHexString());
  print(16.toHexString());
  print(32.toHexString());
}

/// todo
extension IntExtension on int {
  String toBinaryString() => this.toRadixString(2);

  String toOctalString() => this.toRadixString(8);

  String toHexString() => this.toRadixString(16);

  // String toBinaryString() {
  //   var str = "";
  //   var temp = this;
  //
  //   while (temp > 0) {
  //     str = "${temp % 2}$str";
  //     temp = temp >> 1;
  //   }
  //
  //   return str;
  // }
  //
  // String toOctalString() {
  //   var str = "";
  //   var temp = this;
  //
  //   while (temp > 0) {
  //     str = "${temp % 8}$str";
  //     temp = temp >> 3;
  //   }
  //
  //   return str;
  // }
  //
  // String toHexString() {
  //   var str = "";
  //   var temp = this;
  //
  //   while (temp > 0) {
  //     str = "${temp % 16}$str";
  //     temp = temp >> 4;
  //   }
  //
  //   return str;
  // }
}
