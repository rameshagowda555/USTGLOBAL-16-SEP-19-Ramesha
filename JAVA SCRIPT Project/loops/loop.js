var mobiles=['redmi','samsung','vivo','oppo']
console.log('For of loops')
for(var element of mobiles){
    console.log('value',element);
}
console.log('========================');


console.log('For in Loops for arrays')

for(var index in mobiles){
    console.log('value',index);
}
console.log('========================');


console.log('for in loops for objects');
var person={
    name:'sundari',
    age:33,
    color:'white'
}
for(var key in person){
    console.log('value=',person[key]);
}
console.log('============================')


console.log('forEach Method of Array');
var movies=['sholay','Mayabazar','jurassic','titanic'];
movies.forEach(function(value,index){
    console.log('Movie=',value)
    console.log('Movie Index=',index)
})


var items=[{
    item:'bangles',
    id:1,
    price:100
},
{
    item:'eyeliner',
    id:2,
    price:100  
},
{
    item:'watch',
    id:3,
    price:1000
},
{
    item:'bikes',
    id:4,
    price:1000000
}]
items.forEach(function(item,index){
    console.log('items=',item);
    console.log('index of items=',index);
})

console.log('========================')


//example for does not consider
var numbers=[10,20,,30,,40]
numbers[4]=50;
numbers['value']=60;
for(var i=0;i<numbers.length;i++){
console.log('for loop=',numbers[i]);
}
console.log('=========================')
for(var i in numbers){
console.log('for in loop=',numbers[i])
}