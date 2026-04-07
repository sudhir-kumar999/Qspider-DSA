function swapArr(){
    let arr=[1,2,3,6,5,4,7]
    let k=1;
    let j=3;
    let newArr=[]
    for(let i=0;i<arr.length;i++){
        if(i==k){
            newArr[i]=arr[j]
        } else if(i==j){
            newArr[i]=arr[k]
        }else{
        newArr[i]=arr[i]
        }
    }
    console.log(newArr)
}
swapArr()