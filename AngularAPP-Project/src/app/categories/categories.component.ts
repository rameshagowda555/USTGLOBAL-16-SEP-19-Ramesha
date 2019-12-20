import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {

  news;
  inputData: any;

  constructor(public http : HttpClient) { 
    this.getNews();
  }

  ngOnInit() {
  }

  getCategories(event){
    this.inputData = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=0325f6839bbe4be0abb3c9ed41de84f6&category='+this.inputData).subscribe(data =>{
      this.news =data.articles;
    },);
  }

  getNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=health&apiKey=0325f6839bbe4be0abb3c9ed41de84f6').subscribe(data=>{
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
