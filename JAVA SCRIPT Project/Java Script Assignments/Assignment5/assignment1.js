let password = document.getElementById("password");
let username = document.getElementById("username");

function showPassword() {
   
    if (password.type === "password") {
      password.type = "text";
    } else {
      password.type = "password";
    }
  }

