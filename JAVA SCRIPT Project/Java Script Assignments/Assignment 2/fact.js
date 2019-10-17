//Named Functions
function factorial(num)
{
    var fact=1,i;
    for(i=1;i<=num;i++)
    {
    fact=fact*i;
    }
    return fact;
}
var res=factorial(5);
console.log('Factorial=',res);

//Function refrences/Anonymous
var ans=function(num)
{
    var fact=1,i;
    for(i=1;i<=num;i++)
    {
    fact=fact*i;
    }
    return fact;
}
var res=ans(4);
console.log('Factorial=',res);

//Self invoked functions
(function(num)
{
    var fact=1,i;
    for(i=1;i<=num;i++)
    {
    fact=fact*i;
    }
    console.log('Factorial=',fact);
    
})(6);

//Fat arrow Functions
var res=(num)=>
{
    var fact=1,i;
    for(i=1;i<=num;i++)
    {
    fact=fact*i;
    }
    return fact; 
}
var res=ans(4);
console.log('Factorial=',res);
