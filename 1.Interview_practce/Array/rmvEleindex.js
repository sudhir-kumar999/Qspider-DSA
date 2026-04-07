function rmvEleIndex(){
    let arr=[1,23,4,5,6,8,9]
    let newArr=[]
    let index=4
    for(let i=0;i<arr.length;i++){
        if(i!==index){
            newArr.push(arr[i])
        }
    }
    console.log(newArr)
}
// rmvEleIndex()

// without extra array
function removeELe(){
    let arr=[1,2,3,6,7,5,4,8]
    let index=4;
    for(let i=index;i<arr.length;i++){
        arr[i]=arr[i+1]
    }
    arr.length=arr.length-1
    console.log(arr)
}
removeELe()