function frequency(){
    let nums=[1,2,3,4,2,1,5,6,6,4,1,2,3,6,6,5]
    let freq={}
    for(let i=0;i<nums.length;i++){
        let element=nums[i]
        if(freq[element]){
            freq[element]++
        }else{
            freq[element]=1
        }
    }
    console.log(freq)
    
}
frequency()