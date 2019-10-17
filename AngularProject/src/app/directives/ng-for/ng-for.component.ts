import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
   Products = [
    {
      img :'https://cdn.pixabay.com/photo/2016/06/07/17/15/yogurt-1442034__340.jpg',
      name :'Ice Cream',
      price : 200
    },
    {
      img :'https://cdn.pixabay.com/photo/2016/04/15/08/04/strawberries-1330459__340.jpg',
      name :'Strawbery',
      price : 150
    },
    {
      img : 'https://cdn.pixabay.com/photo/2015/09/02/12/27/eggs-918437__340.jpg',
      name :'Egg',
      price : 200
    },
  ]

  constructor() { }

  ngOnInit() {
  }

}
