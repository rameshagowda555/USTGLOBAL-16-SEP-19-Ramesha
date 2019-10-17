 console.log(hoist);
 var hoist;

 console.log(hoist1);
 var hoist1=10;//only declaration is hoisted not value

 function hoisting(){
     console.log(hoistingA)
     var hoistingA;
 }
 hoisting();
 
 function hoisting1(){
    console.log(hoistingA)
    var hoistingA=10;
}
hoisting1();