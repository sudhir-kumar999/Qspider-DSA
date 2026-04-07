function printEvenStr(){
    let str="hello my name is sudhir kumar"
    let prevCount=0;
    let strNew=""
    for(let i=0;i<str.length;i++){
        if(str[i]!=" "){
            strNew+=str[i]
            prevCount++;
        }else{
            if(prevCount%2==0){
                console.log(strNew)
            }
            strNew=" ";
            prevCount=0;
        }

    }
}
printEvenStr()