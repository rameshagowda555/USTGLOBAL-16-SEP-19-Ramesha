import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  
  selectedCar;

  Cars = [
    {
    name :'BMW',
    imgUrl :'https://cdn.pixabay.com/photo/2015/05/15/14/46/bmw-768688__340.jpg'
    },
    {
      name :'BENZ',
      imgUrl :'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg'
    },
    {
      name :'AUDI',
      imgUrl :'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg'
    },
    {
      name :'LAMBORGINI',
      imgUrl :'https://cdn.pixabay.com/photo/2018/12/10/01/31/car-3866113__340.jpg'
    },
    {
      name : 'DUSTER',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/07/09/13/05/dacia-837864__340.jpg'
    }]

  constructor() { }

  ngOnInit() {
  }
sendCar(car) {
  this.selectedCar = car;
  console.log(car);
}

}
