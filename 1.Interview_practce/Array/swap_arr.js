function swapArr(){
    let arr1=[1,2,3,4,5,6];
    let arr2=[2,3,6,5,4,7];
    let temp=[];

    for(let i=0;i<arr1.length || i<arr2.length;i++){
        temp[i]=arr1[i];
        arr1[i]=arr2[i];
        arr2[i]=temp[i];
    }
    console.log("arr1 is ", arr1)
    console.log("arr2 is ", arr2)

}
swapArr()