function repeatChar(){
    let str="programming"
    let freq={}
    for(let i=0;i<str.length;i++){
        if(freq[str[i]]){
            freq[str[i]]++
        }else{
            freq[str[i]]=1
        }
    }
    // console.log(freq)

    // first repeating char
    for(let key in freq){
        if(freq[key]==2){
            console.log(key)
            return
        }
    }

    // last repeating char
    // for(let i = str.length - 1; i >= 0; i--){
    //     if(freq[str[i]] > 1){
    //         console.log(str[i]);
    //         return;
    //     }
    // }
}
repeatChar()