function duplicate(){
    const arr=[1,2,1,3,2,6,5,4]
    const arr2=[];
    for(let i=0;i<arr.length;i++){
    let found=false;

        for(let j=0;j<arr2.length;j++){
            if(arr[i]===arr2[j]){
                found=true
                break
            }
        }
        if(!found){
            arr2.push(arr[i])
        }
    }
    console.log(arr2)
}

duplicate()