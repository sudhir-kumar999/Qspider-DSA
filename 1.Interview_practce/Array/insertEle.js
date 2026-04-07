function insertEle(){
    let arr=[1,2,3,4,5,6,7,8,9]
    let index=5;
    let ele=20;
    let j=0;
    let newArr=[]
    for(let i=0;i<arr.length;i++){
        if(i==index){
            newArr[j++]=ele;
        }
        newArr[j++]=arr[i]
    }
    console.log(newArr)
}
insertEle()