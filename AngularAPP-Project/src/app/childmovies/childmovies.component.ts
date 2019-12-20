import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childmovies',
  templateUrl: './childmovies.component.html',
  styleUrls: ['./childmovies.component.css']
})
export class ChildmoviesComponent implements OnInit {
  @Input()movie;
  constructor() { }

  ngOnInit() {
  }

}
