import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  selectedLaptop;
Laptops =[
  {
    name :'Asus ROG Gaming',
    imgUrl :'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
    price : 'Rs : 53000',
    information :'ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
  },
  {
    name :'HP Pavillion',
    imgUrl :'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
    price : 'Rs : 40000',
    information :'HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'
  },
  {
    name :'Apple Macbook air',
    imgUrl :'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
    price : 'Rs : 59999 ',
    information :'2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.'
  },
  {
    name :'Acer',
    imgUrl :'https://cdn.pixabay.com/photo/2015/05/31/10/51/acer-791027__340.jpg',
    price : 'Rs : 29999',
    information :'Comes W/ Infinity Edge IPS Display. Laptops W/ Intel® Core™ Processor, Buy Now! Cash off on MS Office. Get 3Yr Hardware Warranty. Get 3Yr Premium Support. Amenities: Dell Pro Backpack, Dell Bluetooth Mouse, Dell Professional Headset, Accidental Damage Service.'
  },
  {
    name :'Sony',
    imgUrl :'https://cdn.pixabay.com/photo/2018/09/07/05/41/surface-book-3659999__340.jpg',
    price : 'Rs : 46666',
    information :'Sony Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
  }
]
  constructor() { }

  ngOnInit() {
  }
  sendLaptop(laptop){
    this.selectedLaptop = laptop;
    console.log(laptop);
  }
}
