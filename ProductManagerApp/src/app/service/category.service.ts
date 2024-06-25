import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Category } from '../class/category';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CategoryService {
  private categoryAPI = 'http://localhost:8080/api/categories';

  constructor(private httpClient: HttpClient) {}

  getListCategory(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(`${this.categoryAPI}`);
  }
}
