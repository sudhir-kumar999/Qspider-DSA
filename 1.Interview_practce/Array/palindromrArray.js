function palindromeArr() {
  let arr = [1, 2, 3, 4, 5, 4, 3, 2, 15];
  let newArr = [];
  let j = 0;
  let isPlaindrome=true;
  for (let i = arr.length - 1; i >= 0; i--) {
    newArr[j] = arr[i];
    j++;
  }
  console.log(newArr);
  for (let i = 0; i < arr.length; i++) {
    if (newArr[i] != arr[i]) {
        isPlaindrome=false
        break
    } 
  }
  if(isPlaindrome){
    console.log("palindrome")
  }else{
    console.log("not palindrome")
  }

}
palindromeArr();
