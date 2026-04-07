function firstRepeat(){
    let str= "ssudhir kumar"
    let freq={}
     for(let i=0;i<str.length;i++){
        if(freq[str[i]]){
            freq[str[i]]++
        }else{
            freq[str[i]]=1
        }
     }
     console.log(freq)
     for(let key in freq){
        if(freq[key]==1){
            console.log(key)
            break;
        }
     }
}
firstRepeat()