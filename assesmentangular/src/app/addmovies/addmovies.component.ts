import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';

@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {
  
  get movie(){
    return this.form.get('movie');
  }
  get title(){
    return this.form.get('title');
  }
  get img(){
    return this.form.get('img');
  }
  get desc(){
    return this.form.get('desc');
  }

  constructor() { }
  
  form = new FormGroup({
    movie : new FormControl('',[Validators.required]),
    title : new FormControl('',[Validators.required]),
    img : new FormControl('',[Validators.required]),
    desc : new FormControl('',[Validators.required])

  });

  ngOnInit() {
  }
  loginData(form:NgForm){
    console.log(form);
  }

}
