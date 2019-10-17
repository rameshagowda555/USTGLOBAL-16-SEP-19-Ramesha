//Named function
function circumference(rad)
{
    var res=0;
    res=2*Math.PI*rad;
 return res;
}
var value=circumference(5);
console.log('Value=',value);
//Function Expression
var ans=function(rad)
{
    var res=0;
    res=2*Math.PI*rad;
 return res;
}
var value=ans(5);
console.log('Value=',value);
//Self Invoked Function
(function(rad)
{
    var res=0;
    res=2*Math.PI*rad;
    console.log('Value=',res);
})(5);
//Fat Arrow Function
var ans=rad=>
{
    var res=0;
    res=2*Math.PI*rad;
    console.log('Value=',res);   
}
ans(5);