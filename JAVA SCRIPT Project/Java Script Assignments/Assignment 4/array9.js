var array9 = ['google','chrome','browser','mozila']
    console.log('=============foreach function========================');
    array9.forEach((value,index)=>{
        console.log(value);
    })
    console.log('==========is array===========================');
    var isArray = Array.isArray(array9);
    console.log(isArray);
    console.log('============ includes=========================');
     var newArray = array9.includes('browser',1);
     console.log(newArray);
     console.log('=============push function========================');
     var newArray1 = array9.push('opera');
     console.log('return type is '+newArray1 );
     console.log(array9);
     console.log('=============pop function========================');
     var newArray2 = array9.pop();
     console.log(array9);
     console.log( 'poped element='+newArray2 );
     console.log('=============shift function========================');
     var newArray3 = array9.shift('youtube');
     console.log('shifted element='+newArray3 );
     console.log(array9);
     console.log('=============unshift function========================');
     var newArray4 = array9.unshift('youtube');
     console.log( 'return type='+newArray4 );
     console.log(array9);
     console.log('=============splice function========================');
     var newArray5 = array9.splice(2,1,'chrome','browser');
     console.log(newArray5);
     console.log(array9);
     console.log('=============slice function========================');
     var newArray6 = array9.slice(1,3);
     console.log(newArray6);
     console.log(array9);
     console.log('=============join function========================');
     var newArray7 = array9.join('--$--');
     console.log(newArray7);
     console.log(array9);
     console.log('=============indexOf function========================');
     var newArray8 = array9.indexOf('google');
     console.log(newArray8);
     console.log(array9); 
     console.log('=============map function========================');
     var newArray9 = array9.map((value,index)=>{
         value = value+10;
         return value;
     });
     console.log(newArray9);
     console.log(array9);
     console.log('=============filter function========================');
     var newArray10 = array9.filter((value,index)=>{
         var len = value.length;
         return len>6;
     });
     console.log(newArray10);
     console.log(array9);