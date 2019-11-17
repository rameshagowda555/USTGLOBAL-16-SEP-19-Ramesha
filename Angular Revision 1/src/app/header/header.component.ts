import { Component, OnInit, DoCheck } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  userType: string;
  constructor(private router: Router ) { }
 
  isLoggedIn() {
    const userDetails  = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }
  isAdmin() {
    const userDetails  = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.user.userType === 'Admin' ) {
      return true;
    } else {
      return false;
    }
  }

  isStudent() {
    const userDetails  = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.user.userType === 'Student' ) {
      return true;
    } else {
      return false;
    }
  }
  logout() {
    const userDetails  = JSON.parse(localStorage.getItem('userDetails'));
    this.router.navigateByUrl('/login')
  }

}
