var array10 = ['music','vidio','photos']
    console.log('=============foreach function========================');
    array10.forEach((value,index)=>{
        console.log(value);
    })
    console.log('==========is array===========================');
    var isArray = Array.isArray(array10);
    console.log(isArray);
    console.log('============ includes=========================');
     var newArray = array10.includes('music',1);
     console.log(newArray);
     console.log('=============push function========================');
     var newArray1 = array10.push('games');
     console.log('return type is '+newArray1 );
     console.log(array10);
     console.log('=============pop function========================');
     var newArray2 = array10.pop();
     console.log(array10);
     console.log( 'poped element='+newArray2 );
     console.log('=============shift function========================');
     var newArray3 = array10.shift('calender');
     console.log('shifted element='+newArray3 );
     console.log(array10);
     console.log('=============unshift function========================');
     var newArray4 = array10.unshift('calender');
     console.log( 'return type='+newArray4 );
     console.log(array10);
     console.log('=============splice function========================');
     var newArray5 = array10.splice(2,1,'calender','music');
     console.log(newArray5);
     console.log(array10);
     console.log('=============slice function========================');
     var newArray6 = array10.slice(1,3);
     console.log(newArray6);
     console.log(array10);
     console.log('=============join function========================');
     var newArray7 = array10.join('--$--');
     console.log(newArray7);
     console.log(array10);
     console.log('=============indexOf function========================');
     var newArray8 = array10.indexOf('games');
     console.log(newArray8);
     console.log(array10); 
     console.log('=============map function========================');
     var newArray9 = array10.map((value,index)=>{
         value = value+10;
         return value;
     });
     console.log(newArray9);
     console.log(array10);
     console.log('=============filter function========================');
     var newArray10 = array10.filter((value,index)=>{
         var len = value.length;
         return len>6;
        })
