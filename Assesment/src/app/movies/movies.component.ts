import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
 inputData;
  movies: any;
  constructor(public http : HttpClient) { 
   
  }

  ngOnInit() {
  }
 

  searchMovies(event){
    this.inputData=event.target.value;
    console.log(this.inputData);
    this.http.get<any>('http://www.omdbapi.com/?&apikey=2197268e&s='+this.inputData).subscribe(data=>{
    this.movies = data.Search;  
    console.log(this.movies);
    },err=>{
      console.log("error");
    },()=>{
      console.log("data got successfully");
    })
  }
}
