function Anagram(){
    const str1="eat"
    const str2="tea"

    return str1.split("").sort().join("")===str2.split("").sort().join("")

}

const res=Anagram()
console.log(res)