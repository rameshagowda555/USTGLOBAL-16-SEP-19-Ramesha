import { Component, OnInit } from '@angular/core';
import { BookServiceService } from '../book-service.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  resBooks =[];
  constructor(myService:BookServiceService) { 
    myService.getData().subscribe(responseData=>{
      console.log(responseData);
      this.resBooks=responseData;
    },error=>{
      console.log(error);
    });
  }


  ngOnInit() {
  }

}
