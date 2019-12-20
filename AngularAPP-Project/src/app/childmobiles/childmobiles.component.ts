import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childmobiles',
  templateUrl: './childmobiles.component.html',
  styleUrls: ['./childmobiles.component.css']
})
export class ChildmobilesComponent implements OnInit {
  @Input()mobile;
  constructor() { }

  ngOnInit() {
  }

}
