function unique(){
    let str="programming"
    let freq={}
    let result=""
    for(let i=0;i<str.length;i++){
        if(!freq[str[i]]){
            result+=str[i]
            freq[str[i]]=true
        }
    }
    console.log(result)
    console.log(freq)
}
unique()