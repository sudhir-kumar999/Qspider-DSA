function moveZero(){
    let arr=[1,0,2,0,1,5,0,1,2,0,3]
    let count=0;
    let newArr=[]
    let j=0
    for(let i=0;i<arr.length;i++){
        if(arr[i]!=0){
            newArr[j++]=arr[i]
            count++;
        }
    }
    for(let k=newArr.length;k<arr.length;k++){
        newArr[k]=0
    }
    console.log(newArr)
}
moveZero()