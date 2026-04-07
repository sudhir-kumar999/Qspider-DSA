function largStr() {
  let str = "my name is sudhir kumarsss";
  let prevCount = 0;
  let newCount = 0;
  let strNew = "";
  let str2 = "";
  for (let i = 0; i < str.length; i++) {
    if (str[i] != " ") {
      strNew += str[i];
      prevCount++;
    } else {
        if(prevCount>newCount){
      newCount = prevCount;
      str2 = strNew;
        }
      prevCount = 0;
      strNew = " ";
    }
    if (prevCount > newCount) {
      str2=strNew;
      newCount = prevCount;
    }
  }
  console.log(newCount, str2);
}
largStr();
