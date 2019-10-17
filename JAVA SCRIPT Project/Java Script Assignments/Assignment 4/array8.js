var array8 = ['cup','bottle','jar','mug']
console.log('=============foreach function========================');
array8.forEach((value,index)=>{
    console.log(value);
})
console.log('==========is array===========================');
var isArray = Array.isArray(array8);
console.log(isArray);
console.log('============ includes=========================');
 var newArray = array8.includes('jar',1);
 console.log(newArray);
 console.log('=============push function========================');
 var newArray1 = array8.push('bucket');
 console.log('return type is '+newArray1 );
 console.log(array8);
 console.log('=============pop function========================');
 var newArray2 = array8.pop();
 console.log(array8);
 console.log( 'poped element='+newArray2 );
 console.log('=============shift function========================');
 var newArray3 = array8.shift('mat');
 console.log('shifted element='+newArray3 );
 console.log(array8);
 console.log('=============unshift function========================');
 var newArray4 = array8.unshift('mat');
 console.log( 'return type='+newArray4 );
 console.log(array8);
 console.log('=============splice function========================');
 var newArray5 = array8.splice(2,1,'cup','bottle');
 console.log(newArray5);
 console.log(array8);
 console.log('=============slice function========================');
 var newArray6 = array8.slice(1,3);
 console.log(newArray6);
 console.log(array8);
 console.log('=============join function========================');
 var newArray7 = array8.join('--$--');
 console.log(newArray7);
 console.log(array8);
 console.log('=============indexOf function========================');
 var newArray8 = array8.indexOf('mats');
 console.log(newArray8);
 console.log(array8); 
 console.log('=============map function========================');
 var newArray9 = array8.map((value,index)=>{
     value = value+10;
     return value;
 });
 console.log(newArray9);
 console.log(array8);
 console.log('=============filter function========================');
 var newArray10 = array8.filter((value,index)=>{
     var len = value.length;
     return len>6;
 });
 console.log(newArray10);
 console.log(array8);