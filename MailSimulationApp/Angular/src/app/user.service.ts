import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  register(users): Observable<any> {
    return this.http.post(`http://localhost:8080/registeruser`, users);
  }
  loginUser(users): Observable<any> {
    return this.http.get(`http://localhost:8080/user-login/${users.email}/${users.password}`);
  }
  changePassword(user): Observable<any>{
    return this.http.put(`http://localhost:8080/changepassword`,user);
  }
  send(user): Observable<any>{
    return this.http.put(`http://localhost:8080/sendmail`,user);
  }

  getAllMails():Observable<any>{
    return this.http.get(`http://localhost:8080/get-all/${from_id}`);
  }
}