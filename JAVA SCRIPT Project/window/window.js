console.log('Window object',window);
console.log('This keyword',this);
console.log(this === window);//it compares two methods and these two are same

window.alert('Welcome to JavaScript class')
alert('Welcome to UST global,Torry Harries and Tcs')//alert messeges
let confirmDelete = confirm('Are you sure you want to delete')
console.log('Confirm Delete',confirmDelete)
let userName = prompt('What is Your Name','Ramesha')
console.log('userName',userName)

const person = {
    firstName:'Ramesha',
    age:21,
    lastName: 'Gowda',
    getName:function(){
        console.log('This keyword', this)
        return this.firstName +''+this.lastName
    }
}
let fullName = person.getName()
console.log('FullName=',fullName);