import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-searchnews',
  templateUrl: './searchnews.component.html',
  styleUrls: ['./searchnews.component.css']
})
export class SearchnewsComponent implements OnInit {
 news;
  inputData: any;
  constructor(public http :HttpClient) {
  
   }

  ngOnInit() {
  }
search(event){
  this.inputData = event.target.value;
  this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=0325f6839bbe4be0abb3c9ed41de84f6&q='+this.inputData).subscribe(data=>{
 this.news = data.articles;
},);
}
}
