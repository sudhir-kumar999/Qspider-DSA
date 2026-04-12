//  only unique character keep

function rmvDuplicate(){
    let str="programming"
    let newStr=""
    let freq={}
    for(let i=0;i<str.length;i++){
        if(freq[str[i]]){
            freq[str[i]]++
        }else{
            freq[str[i]]=1
        }
    }
    for(let key in freq){
        if(freq[key]==1){
            newStr+=key
        }
    }
    console.log(newStr)
}
rmvDuplicate()