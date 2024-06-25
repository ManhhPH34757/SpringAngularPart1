import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Brand } from '../class/brand';

@Injectable({
  providedIn: 'root',
})
export class BrandService {
  private brandAPI = 'http://localhost:8080/api/brands';

  constructor(private httpClient: HttpClient) {}

  getListBrand(): Observable<Brand[]> {
    return this.httpClient.get<Brand[]>(`${this.brandAPI}`);
  }
}
