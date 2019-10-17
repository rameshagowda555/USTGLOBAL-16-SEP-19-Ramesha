var apps = ['camscanner','amazon','flipkart','snapdeal']
    console.log('=============foreach function========================');
    apps.forEach((value,index)=>{
        console.log(value);
    })
    console.log('==========is array===========================');
    var isArray = Array.isArray(apps);
    console.log(isArray);
    console.log('============ includes=========================');
     var newArray = apps.includes('facebook',1);
     console.log(newArray);
     console.log('=============push function========================');
     var newArray1 = apps.push('phonepay');
     console.log('return type is '+newArray1 );
     console.log(apps);
     console.log('=============pop function========================');
     var newArray2 = apps.pop();
     console.log(apps);
     console.log( 'poped element='+newArray2 );
     console.log('=============shift function========================');
     var newArray3 = apps.shift('facebook');
     console.log('shifted element='+newArray3 );
     console.log(apps);
     console.log('=============unshift function========================');
     var newArray4 = apps.unshift('amezon');
     console.log( 'return type='+newArray4 );
     console.log(apps);
     console.log('=============splice function========================');
     var newArray5 = apps.splice(2,1,'google pay','temple run');
     console.log(newArray5);
     console.log(apps);
     console.log('=============slice function========================');
     var newArray6 = apps.slice(1,3);
     console.log(newArray6);
     console.log(apps);
     console.log('=============join function========================');
     var newArray7 = apps.join('--$--');
     console.log(newArray7);
     console.log(apps);
     console.log('=============indexOf function========================');
     var newArray8 = apps.indexOf('instagram');
     console.log(newArray8);
     console.log(apps); 
     console.log('=============map function========================');
     var newArray9 = apps.map((value,index)=>{
         value = value+10;
         return value;
     });
     console.log(newArray9);
     console.log(apps);
     console.log('=============filter function========================');
     var newArray10 = apps.filter((value,index)=>{
         var len = value.length;
         return len>6;
     });
     console.log(newArray10);
     console.log(apps);