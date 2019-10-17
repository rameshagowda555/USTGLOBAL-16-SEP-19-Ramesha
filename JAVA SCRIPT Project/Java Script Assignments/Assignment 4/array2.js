var mobiles=['Nokia','Redmi','Samsung','Vivo']
console.log('+++++++++++++++++++For Each method+++++++++++++')
mobiles.forEach((value,index)=>{
    console.log(value)
})
console.log('===========Is Array========')
var res=Array.isArray(mobiles)
    console.log(res);
console.log('============includes=========')
var ans=mobiles.includes('Redmi',1)
console.log(ans)
console.log('================push function=================')
var newArray1 = mobiles.push('oppo');
console.log('pushed element=',newArray1)
console.log(mobiles)
console.log("++++++++++++++++Pop function++++++++++++++")
var newArray2 = mobiles.pop()
console.log('Poped element=',newArray2)
console.log(mobiles)
console.log('+===============Shift function+++++++++++')
var newArray3 = mobiles.shift('Redmi')
console.log('shifted element=',newArray3)
console.log('=============unshift function========================');
var newArray4 = mobiles.unshift('Vivo')
console.log('unshifted element=',newArray4)
console.log('============splice method============')
var newArray5 = mobiles.splice(2,1,'lenova','Realme')
console.log(newArray5)
console.log(mobiles);
     console.log('=============slice function========================');
     var newArray6 = mobiles.slice(1,3);
     console.log(newArray6);
     console.log(mobiles);
     console.log('=============join function========================');
    var newArray7 = mobiles.join('--@--');
     console.log(newArray7);
    console.log(mobiles);
    console.log('=============indexOf function========================');
     var newArray8 = mobiles.indexOf('Realme');
     console.log(newArray8);
     console.log(mobiles); 
    console.log('=============map function========================');
    var newArray9 = mobiles.map((value,index)=>{
    value = value+10;
    return value;
     });
    console.log(newArray9);
    console.log(mobiles);
     console.log('=============filter function========================');
     var newArray10 = mobiles.filter((value,index)=>{
         var len = value.length;
     return len>3;
     });
     console.log(newArray10);
     console.log(mobiles);