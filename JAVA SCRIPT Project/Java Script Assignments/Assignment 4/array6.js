var array6 = ['cocubes','elitmus','amcat ','ssc']
    console.log('=============foreach function========================');
    array6.forEach((value,index)=>{
        console.log(value);
    })
    console.log('==========is array===========================');
    var isArray = Array.isArray(array6);
    console.log(isArray);
    console.log('============ includes=========================');
     var newArray = array6.includes('ssc',1);
     console.log(newArray);
     console.log('=============push function========================');
     var newArray1 = array6.push('ibps');
     console.log('return type is '+newArray1 );
     console.log(array6);
     console.log('=============pop function========================');
     var newArray2 = array6.pop();
     console.log(array6);
     console.log( 'poped element='+newArray2 );
     console.log('=============shift function========================');
     var newArray3 = array6.shift('ias');
     console.log('shifted element='+newArray3 );
     console.log(array6);
     console.log('=============unshift function========================');
     var newArray4 = array6.unshift('amcat');
     console.log( 'return type='+newArray4 );
     console.log(array6);
     console.log('=============splice function========================');
     var newArray5 = array6.splice(2,1,'amcat','ssc');
     console.log(newArray5);
     console.log(array6);
     console.log('=============slice function========================');
     var newArray6 = array6.slice(1,3);
     console.log(newArray6);
     console.log(array6);
     console.log('=============join function========================');
     var newArray7 = array6.join('--@--');
     console.log(newArray7);
     console.log(array6);
     console.log('=============indexOf function========================');
     var newArray8 = array6.indexOf('cocubes');
     console.log(newArray8);
     console.log(array6); 
     console.log('=============map function========================');
     var newArray9 = array6.map((value,index)=>{
         value = value+10;
         return value;
     });
     console.log(newArray9);
     console.log(mobname);
     console.log('=============filter function========================');
     var newArray10 = mobname.filter((value,index)=>{
         var len = value.length;
         return len>6;
     });
     console.log(newArray10);
     console.log(mobname);