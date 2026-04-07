function countSingleChar() {
  let str = "my name is sudhir kumar";
  let char = "s";
  let count = 0;
  for (let i = 0; i < str.length; i++) {
    if (str[i] == char) {
      count++;
    }
  }
  console.log(count);
}
countSingleChar();
