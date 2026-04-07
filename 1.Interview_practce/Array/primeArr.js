function primeCheck(){
    let arr=[2,5,4,6,9,11,8,7,4,5,5]
    let count=0
    let sum=0
    for(let i=0;i<arr.length;i++){
        if(isPrime(arr[i])==true){
            count++
            sum+=arr[i]
        }
    }
    function isPrime(nums){
         if(nums <= 1) return false
        if(nums === 2) return true
        if(nums % 2 === 0) return false

        for(let i=3; i*i <= nums; i+=2){
            if(nums % i === 0){
                return false
            }
        }
        return true
    }
    console.log(count)
    console.log(sum)
}
primeCheck()