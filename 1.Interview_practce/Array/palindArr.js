function palindCheck(){
    let arr=[121,325,323,54,6,56,565,878,88]
    let count=0;
    for(let i=0;i<arr.length;i++){
        if(isPalind(arr[i])==true){
            count++;
        }
    }



    function isPalind(nums){
        let rev=0;
        let original=nums
        while(nums>0){
            let rem=nums%10;
            rev=rev*10+rem;
            nums=Math.floor(nums/10)
        }
        // console.log(rev)
        if(original==rev){
            return true
        }else{
            return false
        }


    }
    console.log(count)
}
palindCheck()