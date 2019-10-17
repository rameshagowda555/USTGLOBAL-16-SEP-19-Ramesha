import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  selectedBikes;
Bikes = [
  {
    name :'BMW',
    imgUrl :'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
    model : 'Model : 1945',
    information : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
  },
  {
    name :'Suzuki',
    imgUrl :'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg',
    model : 'Model : 1885',
    information : 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
  },
  {
    name :'Kawasaki',
    imgUrl :'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
    model : 'Model : 2010',
    information : 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
  },
  {
    name :'RE interceptor',
    imgUrl :'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
    model : 'Model : 2017',
    information : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
  },
  {
    name :'Bugati',
    imgUrl :'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
    model : 'Model : 2015',
    information : 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.'
  },
  {
    name :'Audi',
    imgUrl :'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg',
    model : 'Model : 2015',
    information : 'Audi A3 Variants & Price: The Audi A3 is available in two variants: Premium Plus and Technology, priced from Rs 28.99 lakh to 31.99 lakh (ex-showroom pan-India). Audi A3 Engines: The A3 comes with a 1.4-litre TFSI turbocharged petrol engine that makes 150PS of power and 250Nm.'
  }

]
  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    this.selectedBikes = bike;
    console.log(bike);
  }
}
