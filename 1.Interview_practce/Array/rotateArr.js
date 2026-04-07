function rotateArr(){
    let arr=[1,2,3,6,5,4,7,8,9]
    let k=2;
    let newArr=[]
    let j=0;
    for(let i=k;i<arr.length;i++){
        newArr[j++]=arr[i]
    }
    for(let l=0;l<k;l++){
        newArr[newArr.length]=arr[l]
    }
    console.log(newArr)
}
rotateArr()