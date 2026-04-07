function sortedOrNot() {
  let arr = [2, 7,1, 7, 8, 9];
  let sorted = true;
  for (let i = 0; i < arr.length-1; i++) {
    if (arr[i] > arr[i + 1]) {
      sorted = false;
      break;
    }
  }
  if (sorted == true) {
    console.log("sorted");
  } else {
    console.log("not sorted");
  }
}

sortedOrNot();
