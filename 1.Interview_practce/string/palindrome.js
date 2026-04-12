function palindrome(){
    let str="sudhirihdus"
    let rev=""
    for(let i=str.length-1;i>=0;i--){
        rev+=str[i]
    }
    // console.log(rev)
    if(rev==str){
        console.log("string is palindrome")
    }else{
        console.log("string is not palindrome")

    }
}
palindrome()