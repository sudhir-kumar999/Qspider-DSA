function isPrime(){
    let num=17;
    if(num%2==0){
        return false
    }
    if(num==1 || num==2){
        return true
    }
    for(let i=3;i*i<num;i++){
        if(num%i==0){
            return false
        }else{
            return true
        }
    }
}
let res=isPrime()
console.log(res)