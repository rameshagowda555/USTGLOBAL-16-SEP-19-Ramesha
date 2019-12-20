import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-newhome',
  templateUrl: './newhome.component.html',
  styleUrls: ['./newhome.component.css']
})
export class NewhomeComponent implements OnInit {
  news;
  news1;
  news2;
  constructor(public http : HttpClient) {
    this.getNews();
    this.getNews1();
    this.getNews2();
  }

  ngOnInit() {
  }
  
  getNews(){
      // tslint:disable-next-line: max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=entertainment&apiKey=0325f6839bbe4be0abb3c9ed41de84f6')
      .subscribe(data=>{
          console.log(data);
          this.news = data.articles;
      },err=>{
          console.log(err);
      },()=>{
          console.log('News got Successfully');
      })
  }
  
  getNews1(){
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=0325f6839bbe4be0abb3c9ed41de84f6').subscribe(data=>{
        console.log(data);
        this.news1 = data.articles;
    },err=>{
        console.log(err);
    },()=>{
        console.log('News got Successfully');
    })
}
getNews2(){
  // tslint:disable-next-line: max-line-length
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=0325f6839bbe4be0abb3c9ed41de84f6').subscribe(data=>{
      console.log(data);
      this.news2 = data.articles;
  },err=>{
      console.log(err);
  },()=>{
      console.log('News got Successfully');
  })
}
 }