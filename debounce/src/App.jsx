import React from 'react'
import { useState } from 'react';

const App = () => {
  const [query,setQuery]=useState("")
  function debounce(fn,delay){
    let timer;
    return function(...args){
      clearTimeout(timer);
      timer=setTimeout(() => {
        fn(...args)
      }, delay);
    }
  }
  const handleSearch=(value)=>{
    console.log(value)
  }

  const debouncing=debounce(handleSearch,5000)

  return (
    <div>
      hello
      <input type="text" onChange={(e)=>{
        setQuery(e.target.value);
        debouncing(e.target.value)
      }}/>
    </div>
  )
}

export default App
