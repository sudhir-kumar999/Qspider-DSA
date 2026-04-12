function longWord(){
    let str="my name is sudhir kumar"
    let word=""
    let larg=0

    for(let i=0;i<str.length;i++){
        let count=0
        if(str[i]==" "){
            word+=str[i]
            count++
        }
        if( str[i]==" " && count>larg){
            word=""
        }
    }
}