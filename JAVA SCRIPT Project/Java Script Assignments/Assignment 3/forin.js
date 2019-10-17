//for in loop for arrays
var mobiles=['redmi','samsung','apple','oppo','vivo'];
for(var index in mobiles){
    console.log(mobiles)
    console.log('value',index);
}
console.log('================')
var laptop=new Array('lenova','dell','hp','sony');
for(var index in laptop){
    console.log(laptop)
    console.log('numbers=',index)
}
console.log('================')
var bikes=['ktm','pulsor','sujuki'];
for(var index in bikes){
    console.log(bikes)
    console.log('numbers=',index)
}
console.log('================')
var cars=['bmw','benz','sujuki'];
for(var index in cars){
    console.log(cars)
    console.log('numbers=',index)
}
console.log('================')
var juice=['maaza','slice','7up'];
for(var index in juice){
    console.log(juice)
    console.log('numbers=',index);
}
console.log('================')
var fruits=['Apple','mango','pineapple','banana'];
for(var index in fruits){
    console.log(fruits)
    console.log('numbers=',index)
}
console.log('================')
var flowers=['Rose','sunflower','daisy','fulip','jasmine'];
for(var index in flowers){
    console.log(flowers)
    console.log('numbers=',index)
}
console.log('================')
var animals=['Tiger','lion','cheetha','dog'];
for(var index in animals){
    console.log(animals)
        console.log('numbers=',index)
}
console.log('================')
var birds=['eagle','goldfinch','bulbul','sparrow'];
for(var index in birds){
    console.log(birds)
    console.log('numbers=',index)
}
console.log('================')
var watches=['fastrack','sonata','Timex','casio'];
for(var index in watches){
    console.log(watches)
    console.log('numbers=',index)
}

//for in loop for objects
console.log('=======+++++++++++++==========')
var person={
    name:'ramesha',
    age:21,
    color:'white'
}
for(var key in person){
    console.log(key+'='+person[key])
}
console.log('=======+++++++++++++==========')
var laptop={
    name:'lenova',
    prize:45000,
    ram:'8gb'
}
for(var key in laptop){
    console.log(key+'='+laptop[key])
}
console.log('=======+++++++++++++==========')
var car={
    name:'BMW',
    cost:6500000
}
for(var index in car){
    console.log(index+'='+car[index])
}
console.log('=======+++++++++++++==========')
var mobile=new Object();
mobile.name='redmi';
mobile.prize=15000;
mobile.ram='8GB';
for(var key in mobile){
    console.log(key+'='+mobile[key])
}
console.log('===============================')
var person=new Object()
person.name='Ramesha';
person.id=555;
person.sal=25222;
for (var key in person)
{
    console.log(key+'='+person[key])
}console.log('===========================');
var Student=new Object();
        Student.FirstName='Ramesha';
        Student.LastName='Gowda';
        Student.Id=555;
        Student.Marks=85;
        for(var key in Student){
            console.log(key+'='+Student[key])
        }
        console.log('+++++++++++++++++++++++++++++');
        var pen=new Object();
        pen.color='blue';
        pen.prize=10;
        pen.name='vector';
        for(var test in pen){
            console.log(test+'='+pen[test])
        }
        console.log('++++++++++++++++++=')
        var book=new Object();
        book.name='javaScript';
        book.price=5242;
        for(var test in book){
            console.log(test+''+book[test])
        }