var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "Ramesha";
console.log(myName, typeof myName);
var age = 21;
console.log(age, typeof age);
var mobileNumber;
mobileNumber = 7411024475;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = "Bannur Hobli T.N pura Taluk,Mysore District";
console.log(address, typeof address);
var calAge = function () {
    console.log("age is 22");
};
calAge();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person("Ramesha", 21);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollNO) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNO = rollNO;
        return _this;
    }
    return Student;
}(Person));
var student1 = new Student("Mahesha", 45, 555);
console.log(student1);
