import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../class/product';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private productApi = 'http://localhost:8080/api/products';

  constructor(private httpClient: HttpClient) {}

  getListProduct(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${this.productApi}`);
  }

  addProduct(product:Product): Observable<object>{
    return this.httpClient.post(`${this.productApi}`, product);
  }
}
