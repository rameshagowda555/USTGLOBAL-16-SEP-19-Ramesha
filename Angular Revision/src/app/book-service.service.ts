import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  constructor(private http:HttpClient) { }
  getData():Observable<any>{
    return this.http.get('localhost:8080/librarymanagementsystem/search-allbooks');
  }
}
