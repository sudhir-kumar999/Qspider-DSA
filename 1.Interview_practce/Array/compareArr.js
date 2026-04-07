function compareArr(){
    let arr1=[1,2,3,4,5,6]
    let arr2=[1,2,3,4,5,6]
    let isSame=true
    for(let i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            isSame=false
            break;
        }
    }
if(isSame){
    console.log("same")
}else{
    console.log("not same")
}

}
compareArr()