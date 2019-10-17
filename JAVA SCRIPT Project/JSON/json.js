const person={
    name : "Ramesha",
    age : 21,
    color : "white",
    address : {
                city : 'Mysore',
                state : 'Karnataka',
                pincode : 571101
             },
    hobbies : ['coding','Bird Watching','Singing']
}
console.log('JavaScript person Object',person);

const jsonObject = JSON.stringify(person)
console.log('JSON person Object',jsonObject);

const javaScriptObject = JSON.parse(jsonObject)
console.log('JavaScript person Object after parse',javaScriptObject);

localStorage.setItem('email','billgates@gmail.com')
 const emailId = localStorage.getItem('email')
 console.log('Email ID',emailId)
 localStorage.clear();