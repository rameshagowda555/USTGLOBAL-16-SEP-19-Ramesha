import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name : string = 'Ramesha';
  imgUrl : string ='https://cdn.pixabay.com/photo/2018/02/07/16/59/tree-3137482__340.jpg ';
  address :string = 'Bannur Mysore-571101 Karnataka';
  colorName : string = 'blue';
  isActive : boolean = false;
  colSpanValue = "2" ;
  
  constructor() {
    setInterval(() => {
      this.colorName = 'green';
      this.imgUrl = 'https://cdn.pixabay.com/photo/2017/11/04/11/25/fog-2917232__340.jpg';
      this.isActive = !this.isActive ;
    },2000)
   }

  ngOnInit() {
    
  }

}
