function countDigit() {
  let str = "my 2 name is 8 sudhir 4 kumar 6";
  let count = 0;
  for (let i = 0; i < str.length; i++) {
    if (str[i] >= "0" && str[i] <= "9") {
      count++;
    }
  }
  console.log(count);
}
countDigit();
