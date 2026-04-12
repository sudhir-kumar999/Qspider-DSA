function joinNumAlphabet(){
    let str="a4s51d2df5dfd6d2d5";
    let alpha=""
    let num=""
    for(let i=0;i<str.length;i++){
        if(str[i]>='0' && str[i]<='9'){
            num+=str[i]
        }else{
            alpha+=str[i]
        }
    }
    // console.log(num)
    // console.log(alpha)
    console.log(alpha+num)

}
joinNumAlphabet()