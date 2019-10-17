//Named Functions
function add(num1,num2)
{
    console.log('Sum =',num1+num2);
}
add(10,20);
//No Method Overloading
function add(num1,num2,num3)
{
    console.log('Sum',num1+num2+num3);
}
add(10,20,30);

//Function Expression(Anonymous)
var sub=function(num1,num2){
    var subValue=num1-num2;
    return subValue;
}
var value=sub(30,20);
console.log('value=',value);
//Self Invoked Functions/IIFE(immediate invoked function expression)
(function(num1,num2){
    console.log('value=',num1*num2);
})(5,5);
//Fat Arrow Functions
var div=(num1,num2)=>
{
    console.log('Value=',num1/num2);
}
div(10,5);
console.log('======one Argument======')
var div1=num1=>
{
    console.log('Value=',num1);
}
div1(10);
console.log('======one line code=====');
var div2=num1=>console.log('Value=',num1);
div2(20);
console.log('======one line code=====');
var div3=(num1,num2)=>num1+num2;
var res=div3(20,10);
console.log('Res=',res);


console.log ('==== call before namedfunctions==='); 
greetings('chandan');
function greetings(msg){
    console.log('Hello',msg);
}

console.log ('==== call before function expression/Annonyms==='); 
greet('Dinga');
var greet=function(msg){
    console.log('Hello',msg);
}

console.log ('==== call before self invoked functions==='); 
test('Dinga');
var test=(msg)=>{
    console.log('Hello',msg);
}