function numIndexes(){
    let str="my 5name 4is 8sudhir 9kumar"
    for(let i=0;i<str.length;i++){
        if(str[i]>='0' && str[i]<='9'){
            console.log(i)
        }
    }
}
numIndexes()