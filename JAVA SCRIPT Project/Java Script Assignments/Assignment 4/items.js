var items = [{
    name:'ring',
    id:1,
    price:5000},
    {name:'kajal',
    id:2,
    price:1000},
    {name:'trimmer',
    id:3,
    price:3000},
    {name:'beardo',
    id:4,
    price:170},
    {name:'bike',
    id:5,
    price:50000},
    {name:'watch',
    id:6,
    price:5000},
    {name:'t_shirt',
    id:7,
    price:2000},
    {name:'pants',
    id:8,
    price:4000},
    {name:'shoe',
    id:9,
    price:3000},
    {name:'mobile',
    id:10,
    price:10000}];


    const updatedItem = items.map(function(value,index){
    value.price+=300;
    return value;
    })
    console.log('updated value',updatedItem);
//fat arrow function
    const item=items.map((value)=>{
     value.price = value.price+300;
     return value;
 })
 console.log('items=',item);
 console.log('original',items);

 //filter function
 var ans=items.filter((value,index)=>{
     return items.price>4000;
 })
 console.log('filter values',ans)