//named functions
function fibonacci(num)
{
    var first=0,second=1,next,i;
    console.log(first);
    console.log(second);
    for(i=2;i<=num;i++)
    {
        next=first+second;
        first=second;
        second=next;
        console.log(next);
    }
}
fibonacci(5);

//Function Expression/Anonymous
console.log('==========================')
var res=function(num)
{
    var first=0,second=1,next,i;
    console.log(first);
    console.log(second);
    for(i=2;i<=num;i++)
    {
        next=first+second;
        first=second;
        second=next;
        console.log(next);
    }
}
res(5);
console.log('===============================');

//Self Invoked function
(function(num)
{
    var first=0,second=1,next,i;
    console.log(first);
    console.log(second);
    for(i=2;i<=num;i++)
    {
        next=first+second;
        first=second;
        second=next;
        console.log(next);
    }
})(4);
console.log('==================================');

//Fat Arrow functions
var res=(num)=>
{
    var first=0,second=1,next,i;
    console.log(first);
    console.log(second);
    for(i=2;i<=num;i++)
    {
        next=first+second;
        first=second;
        second=next;
        console.log(next);
    }
}
res(5);