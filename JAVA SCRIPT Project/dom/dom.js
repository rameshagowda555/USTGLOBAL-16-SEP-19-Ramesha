let h1Element = document.getElementById('demo')
console.log('Element=',h1Element)
console.log('Element Text=',h1Element.textContent)//it prints the element
h1Element.textContent = 'Good Evening'//change the element
console.log('Element Text=',h1Element.textContent)
let buttonElement = document.createElement('button')//create a button element
buttonElement.textContent='Click Me!!!!';//add the text
console.log('Button Element ',buttonElement)
document.body.appendChild(buttonElement)//append the element


let ulElement = document.createElement('ul')
let li1Element=document.createElement('li')
let li2Element=document.createElement('li')
let li3Element=document.createElement('li')

li1Element.textContent='JAVA'
li2Element.textContent='SQL'
li3Element.textContent='JAVA SCRIPT'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color = 'red';
h1Element.style.fontSize = '100px';
buttonElement.style.color='blue';

function showMessage(){
    alert('Hi Hello Welcome!!!!!!')
}
function changeColor(){
    let pElement=document.getElementById('mover')
    pElement.style.color = 'red';
}
function removeColor(){
    let element=document.getElementById('mover')
    element.style.color = 'black';
}
function printHello(){
    console.log('Hello');
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent = userName;
}
let name = 'Ramesha'
let age = 21
let phoneNo = 7411024475
console.log('Name is' +''+ name +'Age is'+''+age+'Phone no is'+phoneNo);
console.log(`Name is ${name} Age is ${age} phone no is ${phoneNo}`)
console.log(`2+2= ${2+2}`)