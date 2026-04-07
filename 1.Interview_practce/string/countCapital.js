function countCapital(){
    let str="My name Is Sudhir KumAr"
    let str2=""
    let count=0;
    for(let i=0;i<str.length;i++){
        if(str[i]>='A' && str[i]<='Z'){
            count++
            str2+=str[i]
        }
    }
    console.log(count)
    console.log(str2)
}
countCapital()