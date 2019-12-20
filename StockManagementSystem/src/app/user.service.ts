import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  showAllProduct(): Observable<any> {
    return this.http.get(`http://localhost:8081/showallproducts`);
  }
  addProduct(product): Observable<any> {
    return this.http.post(`http://localhost:8081/addProduct`, product);
  }
  updateProduct(product): Observable<any> {
    return this.http.put(`http://localhost:8081/updateProduct`, product);
  }
  removeProduct(product): Observable<any>{
    return this.http.delete(`http://localhost:8081/deleteProduct/${product.id}`);
  }
  searchProductByName(product): Observable<any> {
    return this.http.get(`http://localhost:8081/getproduct_byname/${product.name}`);
  }
}
