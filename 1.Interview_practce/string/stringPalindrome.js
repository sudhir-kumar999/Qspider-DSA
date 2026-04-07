function palindrome() {
  let str = "sudhirihdus";
  let strNew = "";
  for (let i = str.length - 1; i >= 0; i--) {
    strNew += str[i];
  }
//   console.log(strNew)
  console.log(strNew === str);
}
palindrome();
