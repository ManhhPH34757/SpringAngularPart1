import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Material } from '../class/material';

@Injectable({
  providedIn: 'root',
})
export class MaterialService {
  private materialAPI = 'http://localhost:8080/api/materials';

  constructor(private httpClient: HttpClient) {}

  getListMaterial(): Observable<Material[]> {
    return this.httpClient.get<Material[]>(`${this.materialAPI}`);
  }
}
