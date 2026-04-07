function original() {
  let arr = [1, 2, 3, 1, 2, 3, 6, 5, 4, 1, 2, 36, 5, 4];
  let newArr = [];
    let k = 0;
  for (let i = 0; i < arr.length; i++) {
    let isDuplicate = false;
    for (let j = 0; j < newArr.length; j++) {
      if (arr[i] === newArr[j]) {
        isDuplicate = true;
        break;
      }
    }
    if (!isDuplicate) {
      newArr[k++] = arr[i];
    }
  }
  console.log(newArr);
}
original();
