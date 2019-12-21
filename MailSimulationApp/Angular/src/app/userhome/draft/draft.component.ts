import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-draft',
  templateUrl: './draft.component.html',
  styleUrls: ['./draft.component.css']
})
export class DraftComponent implements OnInit {
  msg: any;

  constructor(private router: Router, private user: UserService ) { 
    this.getAllMails();
  }

  ngOnInit() {
  }

  getAllMails(){
    this.user.getAllMails().subscribe(responseData => {
      this.msg = responseData.description;
      console.log('Response of login', responseData);
    }, err => {
      console.log(err);
      this.msg = err.description;
    });
  }


}
