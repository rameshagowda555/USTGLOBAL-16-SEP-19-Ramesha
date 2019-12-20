import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
  news;
  inputData: any;

  constructor(public http : HttpClient) {
    this.getNews();
   }

  ngOnInit() {
  }

  getSource(event){
    this.inputData = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=0325f6839bbe4be0abb3c9ed41de84f6&sources='+this.inputData).subscribe(data =>{
      this.news =data.articles;
    },);
  }

  getNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=0325f6839bbe4be0abb3c9ed41de84f6').subscribe(data=>{
      console.log(data);
      this.news = data.articles;
    },err=>{
      console.log(err);
    },
    ()=>{
      console.log("News got Successfully");
    })
  }
}
