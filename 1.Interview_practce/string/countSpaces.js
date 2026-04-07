function countSpaces(){
    let str="my name is sudhir kumar"
    let count=0
    for(let i=0;i<str.length;i++){
        if(str[i]==" "){
            count++
        }
    }
    console.log(count)
}
countSpaces()