function revString(str){
    return str.split("").reverse().join("")
}
const res=revString("sudhirihdus")
if(res==="sudhirihdus"){
    console.log("palindrome")
}
else{
    console.log("not palindrome")
}
// console.log(res)