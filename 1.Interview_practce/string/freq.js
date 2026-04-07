function frequency(){
    let str= "sudhirkumarsingh"
    let freq={}
    for(let i=0;i<str.length;i++){
        let element=str[i]
        if(freq[element]){
            element++
        }else{
            freq[element]=1
        }
    }
    console.log(freq)
}
frequency()