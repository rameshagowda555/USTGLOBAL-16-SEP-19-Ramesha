var devicename = ['mobile','tv','ac','fan','heater']
    console.log('=============foreach function========================');
    devicename.forEach((value,index)=>{
        console.log(value);
    })
    console.log('==========is array===========================');
    var isArray = Array.isArray(devicename);
    console.log(isArray);
    console.log('============ includes=========================');
     var newArray = devicename.includes('fan',2);
     console.log(newArray);
     console.log('=============push function========================');
     var newArray1 = devicename.push('telephone');
     console.log('return type is '+newArray1 );
     console.log(devicename);
     console.log('=============pop function========================');
     var newArray2 = devicename.pop();
     console.log(devicename);
     console.log( 'poped element='+newArray2 );
     console.log('=============shift function========================');
     var newArray3 = devicename.shift('scanner');
     console.log('shifted element='+newArray3 );
     console.log(devicename);
     console.log('=============unshift function========================');
     var newArray4 = devicename.unshift('tv');
     console.log( 'return type='+newArray4 );
     console.log(devicename);
     console.log('=============splice function========================');
     var newArray5 = devicename.splice(2,1,'tv','ac');
     console.log(newArray5);
     console.log(devicename);
     console.log('=============slice function========================');
     var newArray6 = devicename.slice(1,3);
     console.log(newArray6);
     console.log(devicename);
     console.log('=============join function========================');
     var newArray7 = devicename.join('--@--');
     console.log(newArray7);
     console.log(devicename);
     console.log('=============indexOf function========================');
     var newArray8 = devicename.indexOf('tv');
     console.log(newArray8);
     console.log(devicename); 
     console.log('=============map function========================');
     var newArray9 = devicename.map((value,index)=>{
         value = value+10;
         return value;
     });
     console.log(newArray9);
     console.log(devicename);
     console.log('=============filter function========================');
     var newArray10 = devicename.filter((value,index)=>{
         var len = value.length;
         return len>6;
     });
     console.log(newArray10);
     console.log(devicename);