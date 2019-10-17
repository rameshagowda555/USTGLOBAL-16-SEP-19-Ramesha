//Named Functions
function add(a1)
{
    var i,sum=0;
    for(i=0;i<a1.length;i++)
    {
        sum=sum+a1[i];
    }
    console.log('Sum=',sum);
}
var a1=[10,20,30,40];
add(a1);

//Named Functions
function add1(a1)
{
    var i,sum=0;
    for(i=0;i<a1.length;i++)
    {
        sum=sum+a1[i];
    }
    console.log('Sum=',sum);
}
var a1=new Array(10,20,30,40);
add1(a1);

//Function ERxpression
var add =function(a1)
{
    var i,sum=0;
    for(i=0;i<a1.length;i++)
    {
        sum=sum+a1[i];
    }
    console.log('Sum=',sum);
}
var a1=[10,20,30,40];
add(a1);

//Self Invoked Functions
(function(a1)
{
    var i,sum=0;
    for(i=0;i<a1.length;i++)
    {
        sum=sum+a1[i];
    }
    console.log('Sum=',sum);
})(a1);
var a1=[10,20,30,40];

//Fat Arrow Functions
var add =(a1)=>
{
    var i,sum=0;
    for(i=0;i<a1.length;i++)
    {
        sum=sum+a1[i];
    }
    console.log('Sum=',sum);
}
var a1=[10,20,30,40];
add(a1);



