import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-searchallbookbylibrarian',
  templateUrl: './searchallbookbylibrarian.component.html',
  styleUrls: ['./searchallbookbylibrarian.component.css']
})
export class SearchallbookbylibrarianComponent implements OnInit {

  books: any[];
  constructor(private service: StudentService) {
    this.getAllbooks();
  }

  getAllbooks() {
    this.service.showAllBooks().subscribe(responseData => {
      console.log(responseData);
      this.books = responseData.bookBean;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Users got successfully');
    });
  }

  ngOnInit() {
  }

}
