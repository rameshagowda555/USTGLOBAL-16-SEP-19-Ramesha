let password = document.getElementById("password");
let username = document.getElementById("username");

function showPassword() {
   
    if (password.type === "password") {
      password.type = "text";
    } else {
      password.type = "password";
    }
  }

document.getElementById("button1").disabled = true;

function validation(){
   
let len1 = username.value.length;
let len2 =password.value.length;
if(len1 > 5 && len2 > 6)
document.getElementById("button1").disabled = false;
else
document.getElementById("button1").disabled = true;

}