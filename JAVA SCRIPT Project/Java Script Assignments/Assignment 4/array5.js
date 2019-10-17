var array5 = ['intel','snapdragon','kirin']
console.log('=============foreach function========================');
array5.forEach((value,index)=>{
    console.log(value);
})
console.log('==========is array===========================');
var isArray = Array.isArray(array5);
console.log(isArray);
console.log('============ includes=========================');
 var newArray = array5.includes('kirin',1);
 console.log(newArray);
 console.log('=============push function========================');
 var newArray1 = array5.push('processer');
 console.log('return type is '+newArray1 );
 console.log(array5);
 console.log('=============pop function========================');
 var newArray2 = array5.pop();
 console.log(array5);
 console.log( 'poped element='+newArray2 );
 console.log('=============shift function========================');
 var newArray3 = array5.shift('intel');
 console.log('shifted element='+newArray3 );
 console.log(array5);
 console.log('=============unshift function========================');
 var newArray4 = array5.unshift('intel');
 console.log( 'return type='+newArray4 );
 console.log(array5);
 console.log('=============splice function========================');
 var newArray5 = array5.splice(2,1,'snapdragon','kirin');
 console.log(newArray5);
 console.log(array5);
 console.log('=============slice function========================');
 var newArray6 = array5.slice(1,3);
 console.log(newArray6);
 console.log(array5);
 console.log('=============join function========================');
 var newArray7 = array5.join('--$--');
 console.log(newArray7);
 console.log(array5);
 console.log('=============indexOf function========================');
 var newArray8 = array5.indexOf('instagram');
 console.log(newArray8);
 console.log(array5); 
 console.log('=============map function========================');
 var newArray9 = array5.map((value,index)=>{
     value = value+10;
     return value;
 });
 console.log(newArray9);
 console.log(array5);
 console.log('=============filter function========================');
 var newArray10 = array5.filter((value,index)=>{
     var len = value.length;
     return len>6;
 });
 console.log(newArray10);
 console.log(array5);