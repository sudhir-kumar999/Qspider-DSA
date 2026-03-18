

function largest(){
    const arr=[1,5,2,,66,3,2,55,5,552]
    let largest=0;
    for(let i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i]
        }
    }
    console.log(largest)
}
largest()