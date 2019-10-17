//Named Function
function checkPrime(num)
{
    var i,count=0;
    for(i=0;i<num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count>2)
    {
    console.log("The Given Number is Not a Prime Number");
    }
    else
    {
    console.log("The Given Number is Prime Number")
    }
}
checkPrime(10);
checkPrime(3);
checkPrime(17);

//Function Expression
var res=function (num)
{
    var i,count=0;
    for(i=0;i<num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count>2)
    {
    console.log("The Given Number is Not a Prime Number");
    }
    else
    {
    console.log("The Given Number is Prime Number")
    }
}
res(10);
res(3);

//Self Invoked Function
(function(num)
{
    var i,count=0;
    for(i=0;i<num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count>2)
    {
    console.log("The Given Number is Not a Prime Number");
    }
    else
    {
    console.log("The Given Number is Prime Number")
    }
})(17);

//Fat Arrow Function
var res=(num)=>
{
    var i,count=0;
    for(i=0;i<num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count>2)
    {
    console.log("The Given Number is Not a Prime Number");
    }
    else
    {
    console.log("The Given Number is Prime Number")
    }
}
res(10);
res(3);
res(17);
