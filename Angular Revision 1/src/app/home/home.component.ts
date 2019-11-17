import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  currentDate = Date.now();
  constructor() { }

  students :Student[] = [{
    name:'Ramesha',
    age:22,
    degree:'BE',
    company:'UST Global'
  },
{
    name:'Megha',
    age:21,
    degree:'BE',
    company:'TY'
},
{
  name:'Sanmathi',
  age:23,
  degree:'BE',
  company:'ITC'
},
{
  name:'Shivu',
  age:23,
  degree:'BE',
  company:'Capgemini'
}]
  ngOnInit() {
  }

}
