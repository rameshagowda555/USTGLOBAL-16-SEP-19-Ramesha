import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  get email(){
    return this.form.get('email');
  }
  get password(){
    return this.form.get('password');
  }

  constructor() { }
  
  form = new FormGroup({
    email : new FormControl('',[Validators.required,CustomValidation.unique]),
    password : new FormControl('',[Validators.required])
  });

  ngOnInit() {
  }
  loginData(form:NgForm){
    console.log(form);
  }
}
