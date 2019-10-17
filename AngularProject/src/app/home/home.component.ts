import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})



export class HomeComponent {
    // imgUrl = 'https://placeimg.com/380/230/animals';
    // isActive : boolean = false;

    news;
    constructor(private http: HttpClient) {
        // setInterval(() => {
        //     this.isActive = !this.isActive ;
        //   },2000)

        this.getNews();

    }
    getNews(){
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=0325f6839bbe4be0abb3c9ed41de84f6').subscribe(data=>{
            console.log(data);
            this.news = data.articles;
        },err=>{
            console.log(err);
        },()=>{
            console.log('News got Successfully');
        })
    }
}
