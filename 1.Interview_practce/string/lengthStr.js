
// with str.length
function strLength(){
    let str="my name is sudhir kumar";
    let count=0
    for(let i=0;i<str.length-1;i++){
        if(str.charAt(i)!==" "){
            count++
        }
    }
    console.log(count)
}
// strLength()

// without str.length
function length(){
    let str="sudhir";
    let count=0;
    while(str[count]!== undefined){
        count++
    }
    console.log(count)
}

// length()
let str="sudhir"
console.log(str[1])