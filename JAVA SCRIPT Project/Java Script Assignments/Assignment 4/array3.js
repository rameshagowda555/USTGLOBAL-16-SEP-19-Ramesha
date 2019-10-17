var array3=['car','bike','cycle']
        console.log('=============foreach function========================');
        array3.forEach((value,index)=>{
            console.log(value);
        })
        console.log('==========is array===========================');
        var isArray = Array.isArray(array3);
        console.log(isArray);
        console.log('============ includes=========================');
         var newArray = array3.includes('car',1);
         console.log(newArray);
         console.log('=============push function========================');
         var newArray1 = array3.push('MTS');
         console.log('return type is '+newArray1 );
         console.log(array3);
         console.log('=============pop function========================');
         var newArray2 = array3.pop();
         console.log(array3);
         console.log( 'poped element='+newArray2 );
         console.log('=============shift function========================');
         var newArray3 = array3.shift('samsungs');
         console.log('shifted element='+newArray3 );
         console.log(array3);
         console.log('=============unshift function========================');
         var newArray4 = array3.unshift('honor');
         console.log( 'return type='+newArray4 );
         console.log(array3);
         console.log('=============splice function========================');
         var newArray5 = array3.splice(2,1,'lenovo','micromax');
         console.log(newArray5);
         console.log(array3);
         console.log('=============slice function========================');
         var newArray6 = array3.slice(1,3);
         console.log(newArray6);
         console.log(array3);
         console.log('=============join function========================');
         var newArray7 = array3.join('--@--');
         console.log(newArray7);
         console.log(array3);
         console.log('=============indexOf function========================');
         var newArray8 = array3.indexOf('car');
         console.log(newArray8);
         console.log(array3); 
         console.log('=============map function========================');
         var newArray9 = array3.map((value,index)=>{
             value = value+10;
             return value;
         });
         console.log(newArray9);
         console.log(array3);
         console.log('=============filter function========================');
         var newArray10 = array3.filter((value,index)=>{
             var len = value.length;
             return len>6;
         });
         console.log(newArray10);
         console.log(array3);