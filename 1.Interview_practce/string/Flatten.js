function flatten(arr){
    let newArr=arr.flat(Infinity)
    console.log(newArr)
}

const arr=[1,2,[3,4,[5,6,7]],8,9,74]
flatten(arr)