import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  msg: string;
  constructor( private auth: AuthService) { }

  register(form: NgForm) {
    this.msg = null;
    this.auth.registerUser(form.value)
    .subscribe(responseData => {
      this.msg = responseData.description;
      console.log(responseData);
      form.reset();
    }, err => {
      console.log(err);
      this.msg = err.responseData.description;
    });
  }

  

  ngOnInit() {
  }

}
