function singleElem2() {
  let nums = [1, 2, 3, 12,12, 2, 4, 4];
  let single = [];
  let freq = {};
  for (let i = 0; i < nums.length; i++) {
    let element = nums[i];
    if (freq[element]) {
      freq[element]++;
    } else {
      freq[element] = 1;
    }
  }
  for (let key in freq) {
    if (freq[key] == 1) {
      // return Number(freq)
      single.push(key);
    }
  }
  console.log(single)
}

singleElem2();
