function secLargest(){
    // let arr=[80,80,43,38,63,69,58,80]
    let arr=[4,3,2,1]
    let largest=0;
    let larg2=0;
    for(let i=0;i<=arr.length;i++){
        if(arr[i]>largest){
            larg2=largest
            largest=arr[i]
        }
        else if(arr[i] > larg2 && arr[i] !== largest){
            larg2 = arr[i];
        }
    }
    console.log(largest)
    console.log(larg2)
}
secLargest()