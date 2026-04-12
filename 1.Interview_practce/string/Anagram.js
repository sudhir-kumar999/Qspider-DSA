function anagram() {
  let str1 = "listen";
  let str2 = "silent";
  let newStr1 = str1.split("").sort().join("");
  let newStr2 = str2.split("").sort().join("");
  console.log(newStr1 == newStr2);
}
// anagram()

function anagram() {
  let str1 = "silent";
  let str2 = "listen";
  let freq1 = {};
  let freq2 = {};
  if (str1.length !== str2.length) {
    console.log("not anagram");
  }

  for (let i = 0; i < str1.length; i++) {
    if (freq1[str1[i]]) {
      freq1[str1[i]]++;
    } else if (freq2[str2[i]]) {
      freq1[str2[i]]++;
    } else {
      freq1[str1[i]] = 1;
      freq2[str2[i]] = 1;
    }
  }
  // console.log(freq1)
  // console.log(freq2)
  for (let key in freq1) {
    if (freq1[key] !== freq2[key]) {
      console.log("not anagram");
      return;
    } else {
      console.log("anagram");
      return;
    }
  }
}
anagram();
