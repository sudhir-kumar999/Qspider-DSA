function reverse(){
    let str="my name is sudhir kumar"
    let words=[];
    let word="";
    for(let i=0;i<str.length;i++){
        if(str[i]!==" "){
            word+=str[i];
        }else{
            if(word!==" "){
            words.push(word)
            word="";
            }
        }
    }
    if(word!==""){
        words.push(word)
    }
    console.log(words)

    let result=""
    for(let i=words.length-1;i>=0;i--){
        result+=words[i]+" ";
    }
    console.log(result)
}
reverse()