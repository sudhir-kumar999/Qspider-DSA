// function freqCount() {
//   let arr = [
//     1, 2, 3, 6, 54, 33, 2, 33, 2, 5, 6, 9, 7, 5, 1, 2, 3, 6, 5, 4, 1, 5, 3,
//   ];
//   let count = 0;
//   let arr2 = [];

//   for (let i = 0; i < arr.length; i++) {
//     for (let j = i; j < arr.length; j++) {
//       if (arr[i] == arr[j]) {
//         count++;
//       }
//     }
//     arr2.push(arr[i] + " " + count);
//     count = 0;
//   }
//   console.log(arr2);
// }
// freqCount();


// with object

// function freqCount() {
//   let arr = [1,2,3,6,54,33,2,33,2,5,6,9,7,5,1,2,3,6,5,4,1,5,3];

//   let freq = {};

//   for(let i = 0; i < arr.length; i++){
//     let num = arr[i];
//     freq[num] = (freq[num] || 0) + 1;
//   }

//   console.log(freq);
// }

// freqCount();
