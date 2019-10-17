const message = new Promise(function(resolve,reject){
    if(10>20){
        resolve('Success')
    }else{
        reject('Failed')
    }
})

message.then(function(msg){
    console.log(msg);
}).catch(function(error){
    console.log(error)
})
//we can pass a Array,Object,Function as Parameter
const employee = new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name : "Ramesha",
            age : 21
        },
        {
            name : "Shivu",
            age : 23
        },
        {
            name : "Ram",
            age : 22
        }])
    }else{
        reject('Failed')
    }
})

employee.then(function(data){
    console.log(data);
}).catch(function(error){
    console.log('Error',error)
})

//Closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count;
    }
    return innerFunction;
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value',counter)
