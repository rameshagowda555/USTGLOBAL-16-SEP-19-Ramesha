let ename : string = "RAmesha";
console.log('name=',ename);

let phoneNo = 7411024475;
console.log('Phone No=',phoneNo);

let sal : number;
sal = 456357;
console.log("salaray=",sal);

let currentAddress;
currentAddress = 571101;
console.log(currentAddress);
currentAddress = "Kunthanahalli village, Bannur Hobli,T.N pura Taluk,Mysore District";
console.log(currentAddress);

let res = function():void{
    console.log("Hello Good Morning");
}
res();
//examples for class,object and inheritance

class Employee{
    constructor(public name : string,public sal : number){

    }
}
let e1 = new Employee("Ramesha",500000);

console.log("Employee Details=",e1);

class Newstudent extends Employee{
    constructor(public name : string,public age : number ){
      super(name,sal)  
    }
}
let s1 = new Newstudent("Ramesha",22);
console.log("student Details=",s1);