function largest(arr){
    let largest=0;
    for(let i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i]
        }
    }
    console.log(largest)
}

const arr=[1,2,3,5,4,6,9]
largest(arr)